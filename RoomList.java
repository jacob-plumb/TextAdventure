import java.util.HashMap;
public class RoomList
{
    private HashMap<Integer, Room> roomList = new HashMap<Integer, Room>();
    
    RoomList()
    {
        EnemyList enemyList = new EnemyList();
        
        Room churchFoyer = new Room();
        churchFoyer.setName("CHURCH FOYER");
        churchFoyer.setDesc("You stand in the foyer of the church. The door to the main altar lies\n"+
                            "to the east, with the door to the town being south. A stone staircase\n"+
                            "leads up to the belltower.");
        churchFoyer.setID(101);
        roomList.put(churchFoyer.getID(), churchFoyer);
        
        Room churchAltar = new Room();
        churchAltar.setName("CHURCH ALTAR");
        churchAltar.setDesc("You're in the main altar room of the church. A large fresco of the sun\n"+
                            "adorns the back wall, with a small statue of the Sun's patron saint,\n"+
                            "Solaire, serving as the altar. Dozens of pews line the room. A door\n"+
                            "to the west leads to the foyer, and a stone stairway leads down into\n"+
                            "the crypts.");
        churchAltar.setID(102);
        roomList.put(churchAltar.getID(), churchAltar);
        
        Room churchBellTower = new Room();
        churchBellTower.setName("CHURCH BELL TOWER");
        churchBellTower.setDesc("You are in the church's bell tower. A large bronze bell hangs over-\n"+
                                "head. You're able to see a good portion of the town -- the bakery,\n"+
                                "the blacksmith, the inn, and the moderately sized marketplace.\n"+
                                "Stone stairs lead down to the church foyer.");
        churchBellTower.setID(111);
        roomList.put(churchBellTower.getID(), churchBellTower);
        
        Room cMarketSquare = new Room();
        cMarketSquare.setName("CENTRAL MARKET SQUARE");
        cMarketSquare.setDesc("This is the central market square.");
        cMarketSquare.setID(103);
        roomList.put(cMarketSquare.getID(), cMarketSquare);
        
        Room blacksmith = new Room();
        blacksmith.setName("BLACKSMITH SHOPPE");
        blacksmith.setDesc("This is the blacksmith shoppe.");
        blacksmith.setID(106);
        roomList.put(blacksmith.getID(), blacksmith);
        
        Room eMarketSquare = new Room();
        eMarketSquare.setName("EASTERN MARKET SQUARE");
        eMarketSquare.setDesc("This is the eastern market square.");
        eMarketSquare.setID(104);
        roomList.put(eMarketSquare.getID(), eMarketSquare);
        
        Room eApproach = new Room();
        eApproach.setName("EASTERN APPROACH");
        eApproach.setDesc("This is the eastern edge of the town.");
        eApproach.setID(105);
        roomList.put(eApproach.getID(), eApproach);
        
        Room sMarketSquare = new Room();
        sMarketSquare.setName("SOUTHERN MARKET SQUARE");
        sMarketSquare.setDesc("This is the southern market square.");
        sMarketSquare.setID(108);
        roomList.put(sMarketSquare.getID(), sMarketSquare);
        
        Room bakery = new Room();
        bakery.setName("BAKERY");
        bakery.setDesc("This is the bakery.");
        bakery.setID(107);
        roomList.put(bakery.getID(), bakery);
        
        Room sApproach = new Room();
        sApproach.setName("SOUTHERN APPROACH");
        sApproach.setDesc("This is the southern edge of town.");
        sApproach.setID(110);
        roomList.put(sApproach.getID(), sApproach);
        
        Room greendolphInn = new Room();
        greendolphInn.setName("GREENDOLPH INN");
        greendolphInn.setDesc("This is the Greendolph Inn.");
        greendolphInn.setID(109);
        roomList.put(greendolphInn.getID(), greendolphInn);
        
        //GEO. SITUATION
        churchFoyer.setUp(111);
        churchFoyer.setEast(102);
        churchFoyer.setSouth(103);
        
        churchAltar.setWest(101);
        
        churchBellTower.setDown(101);
        
        cMarketSquare.setNorth(101);
        cMarketSquare.setSouth(108);
        cMarketSquare.setEast(104);
        cMarketSquare.setWest(106);
        
        blacksmith.setEast(103);
        
        eMarketSquare.setWest(103);
        eMarketSquare.setEast(105);
        eMarketSquare.setSouth(109);
        
        eApproach.setWest(104);
        
        sMarketSquare.setNorth(104);
        sMarketSquare.setSouth(110);
        sMarketSquare.setEast(109);
        sMarketSquare.setWest(107);
        
        bakery.setEast(108);
        
        sApproach.setNorth(108);
        
        greendolphInn.setNorth(104);
        greendolphInn.setWest(108);
    }
    
    public Room getRoom(int ID)
    {
        return roomList.get(ID);
    }
}
