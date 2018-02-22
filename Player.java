import java.util.Scanner;
import java.lang.Math;
public class Player extends Character
{
    private Room currentRoom;
    private Inventory inventory;

    Scanner scanner = new Scanner(System.in);

    WeaponList weaponList = new WeaponList();
    ArmorList armorList = new ArmorList();
    RoomList roomList = new RoomList();

    public Player(Room currentRoom)
    {
        this.currentRoom = currentRoom;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    public void setInventory(Inventory inventory)
    {
        this.inventory = inventory;
    }

    public String getRoomName()
    {
        return currentRoom.getName();
    }

    public String getRoomDesc()
    {
        return currentRoom.getDesc();
    }

    public Room getRoom()
    {
        return currentRoom;
    }

    public void printStats(){
        System.out.println("PLAYER STATS");
        super.printStats();
    }

    public void printMenu()
    {
        System.out.println("MENU");
        System.out.println("1. Stats");
        System.out.println("2. Inventory");
        System.out.println("3. Exit");
        try 
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option == 1)
            {
                this.printStats();
            }
            else if(option == 2)
            {
                this.getInventory().accessMain(this);
            }
            else
            {
                //exit
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.printMenu();
        }
    }

    public void playerMove(int newRoomID)
    {
        if(roomList.getRoom(newRoomID) != null)
        {
            Room newRoom = roomList.getRoom(newRoomID);
            if (newRoom.getEnemy() != null)
            {
                System.out.println("You encounter a " + newRoom.getEnemy().getName() + " in the " + newRoom.getName());
                if (playerCombat(newRoom.getEnemy()))
                {
                    newRoom.setEnemy(0);
                    currentRoom = newRoom;
                }
            }
            else
            {
                currentRoom = newRoom;
            }
        }
    }

    public boolean playerCombat(Enemy enemy)
    {
        //Effect over time on the player
        int[] pEoT = null;
        //Effect over time on the enemy
        int[] eEoT = null;
        while (this.getTempHP() > 0 && enemy.getTempHP() > 0)
        {
            System.out.println();
            System.out.println("-------------" + enemy.getName() + "-------------");
            //Enemy taking an effect each turn
            if(eEoT != null)
            {
                //healing
                if(eEoT[1] > 0)
                {
                    int effect = Dice.roll(eEoT[1], eEoT[2]) + this.getKnow();
                    if((enemy.getTempHP() + effect) > enemy.getMaxHP())
                    {
                        enemy.setTempHP(enemy.getMaxHP());
                        System.out.println("" + enemy.getName() + " regains full health.");
                    }
                    else
                    {
                        enemy.setTempHP(enemy.getTempHP() + effect);
                        System.out.println("" + enemy.getName() + " regains " + effect + " health.");
                    }
                }
                //damage
                else
                {
                    int effect = Dice.roll(eEoT[1], eEoT[2]) - this.getKnow();
                    enemy.setTempHP(enemy.getTempHP() + effect);
                    System.out.println("" + enemy.getName() + " takes " + Math.abs(effect) + " damage.");
                }

                eEoT[0] = eEoT[0] - 1;

                if(eEoT[0] == 0)
                {
                    eEoT = null;
                }
            }

            if(pEoT != null)
            {
                //healing
                if(pEoT[1] > 0)
                {
                    int effect = Dice.roll(pEoT[1], pEoT[2]) + this.getKnow();
                    if((this.getTempHP() + effect) > this.getMaxHP())
                    {
                        this.setTempHP(this.getMaxHP());
                        System.out.println("You regain full health.");
                    }
                    else
                    {
                        this.setTempHP(this.getTempHP() + effect);
                        System.out.println("You regain " + effect + " health.");
                    }
                }
                //damage
                else
                {
                    int effect = Dice.roll(pEoT[1], pEoT[2]) - this.getKnow();
                    this.setTempHP(this.getTempHP() + effect);
                    System.out.println("You take " + Math.abs(effect) + " damage.");
                }

                pEoT[0] = pEoT[0] - 1;

                if(pEoT[0] == 0)
                {
                    pEoT = null;
                }
            }
            
            System.out.println();
            this.printCombatStats();
            enemy.printCombatStats();
            int[] pturn = this.playerTurn(enemy);
            //if the uses a DoT/HoT spell
            if(pturn != null)
            {
                //if the spell is a HoT, it targets the player
                if(pturn[1] > 0)
                {
                    pEoT = pturn;
                }
                //if the spell is a DoT, it targets the enemy
                else
                {
                    eEoT = pturn;
                }
            }

            if (enemy.getTempHP() > 0)
            {
                int lightProc = 10;
                int heavyProc = 10;
                //More likely to light attack if the player has higher dex
                if(this.getDex() > enemy.getDex())
                {
                    lightProc += 5;
                }
                //More likely to heavy attack if the player has less strength
                if(this.getStr() < enemy.getStr())
                {
                    heavyProc += 5;
                }
                //More likely to heavy attack if the player has less dex
                if(this.getDex() < enemy.getDex())
                {
                    heavyProc += 5;
                }

                int check = Dice.roll(1, lightProc + heavyProc);
                if(check <= lightProc)
                {
                    enemy.lightAttack(enemy, this);
                }
                else if(check > lightProc)
                {
                    enemy.heavyAttack(enemy, this);
                }
            }
        }
        if (this.getTempHP() <= 0)
        {
            System.out.println("" + this.getName() + " loses!");
            this.setGold(0);
            this.setTempHP(this.getMaxHP() / 2);
            return false;
        }
        else
        {
            System.out.println("" + this.getName() + " wins, gaining " + enemy.getXP() 
                + " XP and " + enemy.getGold() + " gold!");
            this.setXP(this.getXP() + enemy.getXP());
            this.setGold(this.getGold() + enemy.getGold());
            return true;
        }
    }

    public int[] playerTurn(Enemy enemy)
    {
        System.out.println("1. Light Attack");
        System.out.println("2. Heavy Attack");
        System.out.println("3. Magic");
        System.out.println("4. Consumables");
        System.out.println("5. Flee");
        try 
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option == 1)
            {
                this.lightAttack(this, enemy);
            }
            else if (option == 2)
            {
                this.heavyAttack(this, enemy);
            }
            else if (option == 3)
            {
                Spell chosenSpell = this.getInventory().getPlayerSpells(this, enemy);
                if(chosenSpell == null)
                {
                    playerTurn(enemy);
                }
                else
                {
                    if((this.getTempMP() - chosenSpell.getManaCost()) >= 0)
                    {
                        int[] values = this.castSpell(this, enemy, chosenSpell);
                        return values;
                    }
                    else
                    {
                        System.out.println("You do not have enough mana to cast that.");
                        playerTurn(enemy);
                    }
                }
            }
            else
            {
                this.setTempHP(0);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.printCombatStats();
            enemy.printCombatStats();
            playerTurn(enemy);
        }
        return null;
    }

    public void initDialogue(NPC npc)
    {
        boolean talking = true;
        Dialogue currentDialogue = npc.getDialogue();
        while (talking)
        {
            System.out.println("");
            System.out.println("" + npc.getName() + ":");
            System.out.println("" + currentDialogue.getInitStatement());
            for (int i = 0; i < currentDialogue.getResponseArray().length; i++)
            {
                System.out.println("" + (i+1) + ". " + currentDialogue.getResponse(i));
            }
            try
            {
                String input = scanner.nextLine();
                int option = Integer.parseInt(input);
                if(option > currentDialogue.getResponseArray().length)
                {
                    throw new Exception();
                }
                option--;
                String playerResponse = currentDialogue.getResponse(option);

                if(playerResponse.contains("[Exit]"))
                {
                    System.out.println("");
                    System.out.println("" + npc.getName() + ":");
                    System.out.println("" + currentDialogue.getExitStatement());
                    talking = false;
                }
                else
                {
                    Dialogue newDialogue = currentDialogue.getContra(option);
                    currentDialogue = newDialogue;;
                }
            }
            catch(Exception e)
            {
                System.out.println("INVALID INPUT");
            }
        }
    }

    public void playerCreation()
    {
        creationOptionsFather();
        creationOptionsEarly();
        creationOptionsAdult();
    }

    private void creationOptionsFather()
    {
        System.out.println("Your father was a: ");
        System.out.println("1. Nobleman");
        System.out.println("2. Veteran soldier");
        System.out.println("3. Hunter");
        System.out.println("4. Nomad");
        System.out.println("5. Thief");
        try {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option < 1 || option > 5)
            {
                throw new Exception();
            }

            if (option == 1)
            {
                this.setCon(this.getCon() - 1);
                this.setKnow(this.getKnow() + 1);
                this.setCha(this.getCha() + 1);
                this.setGold(this.getGold() + 20);
            }
            else if (option == 2)
            {
                this.setKnow(this.getKnow() - 1);
                this.setStr(this.getStr() + 1);
                this.setCon(this.getCon() + 1);
                this.setGold(this.getGold() + 10);
            }
            else if(option == 3)
            {
                this.setCha(this.getCha() - 1);
                this.setDex(this.getDex() + 1);
                this.setKnow(this.getKnow() + 1);
                this.setGold(this.getGold() + 10);
            }
            else if (option == 4)
            {
                this.setDex(this.getDex() - 1);
                this.setCon(this.getCon() + 1);
                this.setKnow(this.getKnow() + 1);
                this.setGold(this.getGold() + 5);
            }
            else if (option == 5)
            {
                this.setStr(this.getStr() - 1);
                this.setDex(this.getDex() + 1);
                this.setWis(this.getWis() + 1);
                this.setGold(this.getGold() + 5);
            }
        }
        catch(Exception e)
        {
            System.out.println("INVALID INPUT");
            creationOptionsFather();
        }
    }

    private void creationOptionsEarly()
    {
        System.out.println("During your childhood, you were a: ");
        System.out.println("1. Page");
        System.out.println("2. Apprentice");
        System.out.println("3. Assistant");
        System.out.println("4. Street Urchin");
        System.out.println("5. Steppe Child");
        try {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option < 1 || option > 5)
            {
                throw new Exception();
            }

            if (option == 1)
            {
                this.setStr(this.getStr() + 1);
                this.setCha(this.getCha() + 1);
            }
            else if (option == 2)
            {
                this.setKnow(this.getKnow() + 1);
                this.setStr(this.getStr() + 1);
            }
            else if(option == 3)
            {
                this.setCha(this.getCha() + 1);
                this.setKnow(this.getKnow() + 1);
            }
            else if (option == 4)
            {
                this.setKnow(this.getKnow() + 1);
                this.setDex(this.getDex() + 1);
            }
            else if (option == 5)
            {
                this.setStr(this.getStr() + 1);
                this.setDex(this.getDex() + 1);
            }
        }
        catch(Exception e)
        {
            System.out.println("INVALID INPUT");
            creationOptionsEarly();
        }
    }

    private void creationOptionsAdult()
    {
        System.out.println("During your adulthood, you were a: ");
        System.out.println("1. Squire");
        System.out.println("2. Troubador");
        System.out.println("3. Student");
        System.out.println("4. Peddler");
        System.out.println("5. Smith");
        System.out.println("6. Poacher");
        try {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option < 1 || option > 5)
            {
                throw new Exception();
            }

            if (option == 1)
            {
                this.setStr(this.getStr() + 1);
                this.setDex(this.getDex() + 1);
            }
            else if (option == 2)
            {
                this.setKnow(this.getKnow() + 1);
                this.setCha(this.getCha() + 1);
            }
            else if(option == 3)
            {
                this.setDex(this.getDex() + 1);
                this.setCha(this.getCha() + 1);
            }
            else if (option == 4)
            {
                this.setKnow(this.getKnow() + 1);
                this.setWis(this.getWis() + 1);
            }
            else if (option == 5)
            {
                this.setStr(this.getStr() + 1);
                this.setCon(this.getCon() + 1);
            }
            else if (option == 6)
            {
                this.setDex(this.getDex() + 1);
                this.setWis(this.getWis() + 1);
            }
        }
        catch(Exception e)
        {
            System.out.println("INVALID INPUT");
            creationOptionsEarly();
        }
    }

    //UNFINISHED
    private void creationOptionsReason()
    {
        System.out.println("Your reason for adventuring is: ");
        System.out.println("1. Page");
        System.out.println("2. The loss of a loved one.");
        System.out.println("3. Unquenchable wanderlust");
        System.out.println("4. Being forced from your home");
        System.out.println("5. Steppe Child");
        try {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option < 1 || option > 5)
            {
                throw new Exception();
            }

            if (option == 1)
            {
                this.setStr(this.getStr() + 1);
                this.setCha(this.getCha() + 1);
            }
            else if (option == 2)
            {
                this.setKnow(this.getKnow() + 1);
                this.setStr(this.getStr() + 1);
            }
            else if(option == 3)
            {
                this.setCha(this.getCha() + 1);
                this.setKnow(this.getKnow() + 1);
            }
            else if (option == 4)
            {
                this.setKnow(this.getKnow() + 1);
                this.setDex(this.getDex() + 1);
            }
            else if (option == 5)
            {
                this.setStr(this.getStr() + 1);
                this.setDex(this.getDex() + 1);
            }
        }
        catch(Exception e)
        {
            System.out.println("INVALID INPUT");
            creationOptionsEarly();
        }
    }
}
