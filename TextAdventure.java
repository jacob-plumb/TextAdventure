import java.util.Scanner;
import java.util.ArrayList;
public class TextAdventure
{
    public static void main(String[] args){
        boolean gameLoop = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Where Is My Sun v1.0");
        System.out.println("");
        System.out.println("To play, simply type the direction you wish to go in. Valid directions");
        System.out.println("are north, south, east, west, up, and down. To access the menu, type");
        System.out.println("'menu'. If you are in a room with an NPC, type 'talk' to speak with them.");
        System.out.println("When options are presented, enter the number of the option you want.");

        //CREATING ITEMS
        WeaponList weaponList = new WeaponList();
        ArmorList armorList = new ArmorList();
        EnemyList enemyList = new EnemyList();
        RoomList roomList = new RoomList();
        SpellList spellList = new SpellList();
        MiscItemList miscItemList = new MiscItemList();
        ConsumableList conList = new ConsumableList();
        
        
        Inventory backpack = new Inventory();

        //CREATING THE PLAYER
        Player player = new Player(roomList.getRoom(6001));
        player.setName("PLAYER");
        player.setStr(4);
        player.setDex(4);
        player.setCon(4);
        player.setKnow(4);
        player.setWis(4);
        player.setCha(4);

        player.setWep(weaponList.getItem(1021));
        player.setArmor(armorList.getItem(1512));
        player.setInventory(backpack);
        
        player.getInventory().addItem(weaponList.getItem(1039), 1);
        player.getInventory().addItem(weaponList.getItem(1031), 1);
        player.getInventory().addItem(weaponList.getItem(1000), 1);
        player.getInventory().addItem(armorList.getItem(1531), 1);
        player.getInventory().addItem(armorList.getItem(1521), 1);
        player.getInventory().addItem(spellList.getSpell(2101), 1);
        player.getInventory().addItem(spellList.getSpell(2201), 1);
        player.getInventory().addItem(spellList.getSpell(2501), 1);
        player.getInventory().addItem(miscItemList.getItem(3000), 1);
        player.getInventory().addItem(conList.getItem(7401), 3);
        player.getInventory().addItem(conList.getItem(7101), 2);

        player.setLevel(1);
        player.setGold(0);
        player.setXP(0);
        player.calcMaxHP();
        player.setMaxMP(player.getKnow() * 3);
        player.setTempHP(player.getMaxHP());
        player.setTempMP(player.getMaxMP());

        //START THE GAME WITH PLAYER CREATION

        //WHILE loop for game running condition
        while (gameLoop == true)
        {
            System.out.println();
            System.out.println(player.getRoomName());
            System.out.println(player.getRoomDesc());
            String action = scanner.next();
            action.toLowerCase().trim();

            if (action.equals("up") || action.equals("u"))
            {
                player.playerMove((player.getRoom()).getUp());
            }
            else if (action.equals("down") || action.equals("d"))
            {
                player.playerMove((player.getRoom()).getDown());
            }
            else if (action.equals("north") || action.equals("n"))
            {
                player.playerMove((player.getRoom()).getNorth());
            }
            else if (action.equals("east") || action.equals("e"))
            {
                player.playerMove((player.getRoom()).getEast());
            }
            else if (action.equals("south") || action.equals("s"))
            {
                player.playerMove((player.getRoom()).getSouth());
            }
            else if (action.equals("west") || action.equals("w"))
            {
                player.playerMove((player.getRoom()).getWest());
            }
            else if (action.equals("menu"))
            {
                player.printMenu();
            }
            else if (action.equals("talk"))
            {
                if(player.getRoom().getNPC() != null)
                {
                    player.initDialogue(player.getRoom().getNPC());
                }
            }
            else if (action.equals("exit"))
            {
                gameLoop = false;
            }
        }
    }
}
