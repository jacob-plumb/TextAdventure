import java.util.Scanner;
public class TextAdventure
{
   public static void main(String[] args){
       //GAME LOOP
       boolean gameLoop = true;
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to Text Adventure 0.0");
       
       Room basement = new Room();
       basement.setName("BASEMENT");
       basement.setDesc("You're in the basement, it's dank and spooky.");
       
       Room kitchen = new Room();
       kitchen.setName("KITCHEN");
       kitchen.setDesc("You're in the kitchen. It is not cluttered, but it's super dusty.");
       
       //SETTING MAP COORDINATES
       basement.setUp(kitchen);
       kitchen.setDown(basement);
       
       Player player = new Player(basement);
       
       //WHILE loop for game running condition
       while (gameLoop == true)
       {
           System.out.println(player.getRoomName());
           System.out.println(player.getRoomDesc());
           String action = scanner.next();
           action.toLowerCase();
           
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
               System.out.println("You go north.");
           }
           else if (action.equals("east") || action.equals("e"))
           {
               System.out.println("You go east.");
           }
           else if (action.equals("south") || action.equals("s"))
           {
               System.out.println("You go south.");
           }
           else if (action.equals("west") || action.equals("w"))
           {
               System.out.println("You go west.");
           }else if (action.equals("exit"))
           {
               gameLoop = false;
           }
        }
   }
}
