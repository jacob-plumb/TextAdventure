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
                            "the crypts.");
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
        churchBellTower.setEnemy(5001);
        roomList.put(churchBellTower.getID(), churchBellTower);
        
        Room cMarketSquare = new Room();
        cMarketSquare.setName("CENTRAL MARKET SQUARE");
        cMarketSquare.setDesc("This is the central market square.");
        cMarketSquare.setID(6003);
        cMarketSquare.setEnemy(5002);
        roomList.put(cMarketSquare.getID(), cMarketSquare);
        
        Room blacksmith = new Room();
        blacksmith.setName("BLACKSMITH SHOPPE");
        blacksmith.setDesc("This is the blacksmith shoppe.");
        blacksmith.setID(6006);
        roomList.put(blacksmith.getID(), blacksmith);
        
        Room eMarketSquare = new Room();
        eMarketSquare.setName("EASTERN MARKET SQUARE");
        eMarketSquare.setDesc("This is the eastern market square.");
        eMarketSquare.setID(6004);
        roomList.put(eMarketSquare.getID(), eMarketSquare);
        
        Room eApproach = new Room();
        eApproach.setName("EASTERN APPROACH");
        eApproach.setDesc("This is the eastern edge of the town.");
        eApproach.setID(6005);
        roomList.put(eApproach.getID(), eApproach);
        
        Room sMarketSquare = new Room();
        sMarketSquare.setName("SOUTHERN MARKET SQUARE");
        sMarketSquare.setDesc("This is the southern market square.");
        sMarketSquare.setID(6008);
        roomList.put(sMarketSquare.getID(), sMarketSquare);
        
        Room bakery = new Room();
        bakery.setName("BAKERY");
        bakery.setDesc("This is the bakery.");
        bakery.setID(6007);
        roomList.put(bakery.getID(), bakery);
        
        Room sApproach = new Room();
        sApproach.setName("SOUTHERN APPROACH");
        sApproach.setDesc("This is the southern edge of town.");
        sApproach.setID(6010);
        roomList.put(sApproach.getID(), sApproach);
        
        Room greendolphInn = new Room();
        greendolphInn.setName("GREENDOLPH INN");
        greendolphInn.setDesc("This is the Greendolph Inn.");
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
