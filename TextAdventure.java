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
       basement.setDesc("You're in the basement, it's dank and spooky. The walls are concrete,\n"+
                        "small cranks are abundant. There are quite a few cobwebs, which cover\n"+ 
                        "a cardboard box in the corner. A staircase leads upwards.");
       
       Room kitchen = new Room();
       kitchen.setName("KITCHEN");
       kitchen.setDesc("You're in the kitchen. It is not cluttered, but it's super dusty. The room\n"+
                       "hasn't been used for quite some time. The water is off, the food inside the\n"+
                       "refrigderator is rotten. There's a hatch on the floor, and doorways to the\n"+
                       "north, east, and west.");
       
       Room livingRoom = new Room();
       livingRoom.setName("LIVING ROOM");
       livingRoom.setDesc("You're in the living room. There's a nice couch and an old CRT TV.");
       
       Room foyer = new Room();
       foyer.setName("FOYER");
       foyer.setDesc("You're in the foyer. There's a grandfather clock ticking away.");
       
       Room diningRoom = new Room();
       diningRoom.setName("DINING ROOM");
       diningRoom.setDesc("You're in the dining room. There's a large table, for a family of three.");
       
       Room hallway = new Room();
       hallway.setName("HALLWAY");
       hallway.setDesc("You're in the hallway, a cold chill blows through the empty space.");
       
       Room nursery = new Room();
       nursery.setName("NURSERY");
       nursery.setDesc("You're in the nursery. It seems fully prepared for a child, though unused as of yet.");
       
       Room bedroom = new Room();
       bedroom.setName("BEDROOM");
       bedroom.setDesc("You're in the bedroom. There's a bed with two skeletons on it.");
       
       
       //SETTING MAP COORDINATES
       basement.setUp(kitchen);
       
       kitchen.setDown(basement);
       kitchen.setNorth(foyer);
       kitchen.setEast(diningRoom);
       kitchen.setWest(livingRoom);
       
       foyer.setSouth(kitchen);
       
       bedroom.setSouth(diningRoom);
       
       diningRoom.setNorth(bedroom);
       diningRoom.setWest(kitchen);
       
       livingRoom.setEast(kitchen);
       livingRoom.setSouth(hallway);
       
       hallway.setNorth(livingRoom);
       hallway.setEast(nursery);
       
       nursery.setWest(hallway);
       
       Player player = new Player(basement);
       
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
           }else if (action.equals("exit"))
           {
               gameLoop = false;
           }
        }
   }
}
