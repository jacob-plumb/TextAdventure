import java.util.HashMap;
public class RoomList
{
    private HashMap<Integer, Room> roomList = new HashMap<Integer, Room>();

    EnemyList enemyList = new EnemyList();
    NPCList npcList = new NPCList();

    RoomList()
    {
        /*
         * ROOMS:       6XYZ
         * Town:        60YZ
         * Crypt:       61YZ
         */
        Room churchFoyer = new Room();
        churchFoyer.setName("CHURCH FOYER");
        churchFoyer.setDesc("You stand in the foyer of the church. The door to the main altar lies\n"+
            "to the east, with the door to the town being south. A stone staircase\n"+
            "leads up to the belltower.");
        churchFoyer.setID(6001);
        roomList.put(churchFoyer.getID(), churchFoyer);

        Room churchAltar = new Room();
        churchAltar.setName("CHURCH ALTAR");
        churchAltar.setDesc("You're in the main altar room of the church. A large fresco of the sun\n"+
            "adorns the back wall, with a small statue of the Sun's patron saint,\n"+
            "Solaire, serving as the altar. Dozens of pews line the room. A door\n"+
            "to the west leads to the foyer, and a stone stairway leads down into\n"+
            "the crypts. Father Donovan stands near the altar.");
        churchAltar.setID(6002);
        churchAltar.setNPC(npcList.getNPC(4501));
        roomList.put(churchAltar.getID(), churchAltar);

        Room churchBellTower = new Room();
        churchBellTower.setName("CHURCH BELL TOWER");
        churchBellTower.setDesc("You are in the church's bell tower. A large bronze bell hangs over-\n"+
            "head. You're able to see a good portion of the town -- the bakery,\n"+
            "the blacksmith, the inn, and the moderately sized marketplace.\n"+
            "Stone stairs lead down to the church foyer.");
        churchBellTower.setID(6011);
        churchBellTower.setEnemy(5002);
        roomList.put(churchBellTower.getID(), churchBellTower);

        Room cMarketSquare = new Room();
        cMarketSquare.setName("CENTRAL MARKET SQUARE");
        cMarketSquare.setDesc("You are in the central market square. People are bustling around you,\n"+
            "many small shops display their wares. To the north lies the church\n"+
            "and to the west lies the blacksmith shoppe. The market extends south\n"+
            "and east.");
        cMarketSquare.setID(6003);
        cMarketSquare.setEnemy(5001);
        roomList.put(cMarketSquare.getID(), cMarketSquare);

        Room blacksmith = new Room();
        blacksmith.setName("BLACKSMITH SHOPPE");
        blacksmith.setDesc("You are in the blacksmith shoppe. The line to speak with the smith,\n"+
            "is incredibly long, he must be very popular. The exit lies to your\n"+
            "east.");
        blacksmith.setID(6006);
        roomList.put(blacksmith.getID(), blacksmith);

        Room eMarketSquare = new Room();
        eMarketSquare.setName("EASTERN MARKET SQUARE");
        eMarketSquare.setDesc("You are in the eastern market square. The density of people diminishes\n"+
            "as you get closer to the eastern edge of town, but many market stalls\n"+
            "remain. This town evidently has a thriving commerical sector. The door\n"+
            "to the local tavern lies to the south, with the market extending west.");
        eMarketSquare.setID(6004);
        roomList.put(eMarketSquare.getID(), eMarketSquare);

        Room eApproach = new Room();
        eApproach.setName("EASTERN APPROACH");
        eApproach.setDesc("This is the eastern edge of the town. The road leads into the wilderness.");
        eApproach.setID(6005);
        roomList.put(eApproach.getID(), eApproach);

        Room sMarketSquare = new Room();
        sMarketSquare.setName("SOUTHERN MARKET SQUARE");
        sMarketSquare.setDesc("You are in the southern market square. You can smell the delightful scent\n"+
            "of freshly baked bread coming from the bakery to the west, and the\n"+
            "cheerful rowdiness coming from the tavern to the east. The market\n"+
            "continues up north, with the southern road leading to the edge of town.");
        sMarketSquare.setID(6008);
        roomList.put(sMarketSquare.getID(), sMarketSquare);

        Room bakery = new Room();
        bakery.setName("BAKERY");
        bakery.setDesc("You are in the bakery. The business is packed with folks eagerly,\n"+
            "awaiting their chance to purchase the scrumptious bread that this\n"+
            "bakery is apparently known for. The exit is to the west.");
        bakery.setID(6007);
        roomList.put(bakery.getID(), bakery);

        Room sApproach = new Room();
        sApproach.setName("SOUTHERN APPROACH");
        sApproach.setDesc("This is the southern edge of town. The road leads into the wilderness.");
        sApproach.setID(6010);
        roomList.put(sApproach.getID(), sApproach);

        Room greendolphInn = new Room();
        greendolphInn.setName("GREENDOLPH INN");
        greendolphInn.setDesc("You are in the Greendolph Inn. Jubiliant conversations\n"+
            "are being had all around this busy tavern. Food and drinks are being\n"+
            "served to rowdy patrons, games and gambling galore. The northern exit\n"+
            "leads to the eastern square, while the western exit leads to the southern market.");
        greendolphInn.setID(6009);
        roomList.put(greendolphInn.getID(), greendolphInn);

        //GEO. SITUATION
        churchFoyer.setUp(6011);
        churchFoyer.setEast(6002);
        churchFoyer.setSouth(6003);

        churchAltar.setWest(6001);

        churchBellTower.setDown(6001);

        cMarketSquare.setNorth(6001);
        cMarketSquare.setSouth(6008);
        cMarketSquare.setEast(6004);
        cMarketSquare.setWest(6006);

        blacksmith.setEast(6003);

        eMarketSquare.setWest(6003);
        eMarketSquare.setEast(6005);
        eMarketSquare.setSouth(6009);

        eApproach.setWest(6004);

        sMarketSquare.setNorth(6003);
        sMarketSquare.setSouth(6010);
        sMarketSquare.setEast(6009);
        sMarketSquare.setWest(6007);

        bakery.setEast(6008);

        sApproach.setNorth(6008);

        greendolphInn.setNorth(6004);
        greendolphInn.setWest(6008);
    }

    public Room getRoom(int ID)
    {
        return roomList.get(ID);
    }
}
