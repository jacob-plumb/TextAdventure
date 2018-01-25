import java.util.Scanner;
import java.util.ArrayList;
public class TextAdventure
{
    public static void main(String[] args){
        boolean gameLoop = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Text Adventure 0.0");

        //CREATING ITEMS

        WeaponList weaponList = new WeaponList();
        ArmorList armorList = new ArmorList();
        EnemyList enemyList = new EnemyList();
        RoomList roomList = new RoomList();
        Inventory backpack = new Inventory();

        //CREATING THE PLAYER
        Player player = new Player(roomList.getRoom(101));
        player.setName("PLAYER");
        player.setStr(4);
        player.setDex(4);
        player.setCon(4);
        player.setKnow(4);
        player.setWis(4);
        player.setCha(4);

        player.setWep(weaponList.getItem(101));
        player.setArmor(armorList.getItem(201));
        player.setInventory(backpack);
        
        player.getInventory().addItem(weaponList.getItem(199));

        player.setLevel(1);
        player.setGold(0);
        player.setXP(0);
        player.setMaxHP(player.getCon() * 5);
        player.setMaxMP(player.getKnow() * 5);
        player.setTempHP(player.getMaxHP());
        player.setTempMP(player.getMaxMP());

        //START THE GAME WITH PLAYER CREATION
        /**
         * player.playerCreation();
         */

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
