import java.util.Scanner;
import java.lang.Math;
public class Player extends Character
{
    private Room currentRoom;

    Scanner scanner = new Scanner(System.in);

    WeaponList weaponList = new WeaponList();
    ArmorList armorList = new ArmorList();
    RoomList roomList = new RoomList();

    public Player(Room currentRoom)
    {
        this.currentRoom = currentRoom;
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
        while (this.getTempHP() > 0 && enemy.getTempHP() > 0)
        {
            System.out.println();
            System.out.println("You are facing a " + enemy.getName());
            this.printCombatStats();
            enemy.printCombatStats();
            this.playerTurn(enemy);
            if (enemy.getTempHP() > 0)
            {
                enemy.attack(enemy, this);
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

    public void playerTurn(Enemy enemy)
    {
        System.out.println("1. Attack");
        System.out.println("2. Die");
        try 
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option == 1)
            {
                this.attack(this, enemy);
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
    }

    public void initDialogue(NPC npc)
    {
        boolean talking = true;
        System.out.println();
        System.out.println("" + npc.getName() + ":");
        System.out.println("" + npc.getDialogue().getInitStatement());
        while (talking)
        {
            for (int i = 0; i < npc.getDialogue().getResponseArray().length; i++)
            {
                System.out.println("" + (i+1) + ". " + npc.getDialogue().getResponse(i));
            }
            try
            {
                String input = scanner.nextLine();
                int option = Integer.parseInt(input);
                option--;
                
                String response = npc.getDialogue().getResponse(option);
                
                if (response.contains("[Exit]"))
                {
                    
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("UNABLE TO PARSE INPUT");
            }
            catch(NullPointerException e)
            {
                System.out.println("INPUT OUT OF BOUNDS");
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
        catch(NumberFormatException e)
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
        catch(NumberFormatException e)
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
        catch(NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            creationOptionsEarly();
        }
    }

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
        catch(NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            creationOptionsEarly();
        }
    }
}
