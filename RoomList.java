import java.util.HashMap;
public class RoomList
{
    private HashMap<Integer, Room> roomList = new HashMap<Integer, Room>();
    
    RoomList()
    {
        //ADD TO HASHMAP, DUMBASS
        //roomList.put(ID, item);
        Room churchFoyer = new Room();
        churchFoyer.setName("CHURCH FOYER");
        churchFoyer.setDesc("This is the church foyer.");
        churchFoyer.setID(101);
        roomList.put(churchFoyer.getID(), churchFoyer);
        
        Room churchAltar = new Room();
        churchAltar.setName("CHURCH ALTAR");
        churchAltar.setDesc("This is the church's altar room.");
        churchAltar.setID(102);
        roomList.put(churchAltar.getID(), churchAltar);
        
        Room churchBellTower = new Room();
        churchBellTower.setName("CHURCH BELL TOWER");
        churchBellTower.setDesc("This is the tower of the church.");
        churchBellTower.setID(111);
        roomList.put(churchBellTower.getID(), churchBellTower);
        
        Room cMarketSquare = new Room();
        cMarketSquare.setName("CENTRAL MARKET SQUARE");
        cMarketSquare.setDesc("This is the central market square.");
        cMarketSquare.setID(103);
        roomList.put(cMarketSquare.getID(), cMarketSquare);
        
        Room blacksmith = new Room();
        blacksmith.setName("BLACKSMITH SHOPPE");
        blacksmith.setName("This is the blacksmith shoppe.");
        blacksmith.setID(106);
        roomList.put(blacksmith.getID(), blacksmith);
        
        Room eMarketSquare = new Room();
        eMarketSquare.setName("EASTERN MARKET SQUARE");
        eMarketSquare.setDesc("This is the central market square.");
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
        
        //MOVEMENT
        churchFoyer.setUp(111);
        churchFoyer.setEast(102);
        churchFoyer.setSouth(103);
        
        churchAltar.setWest(101);
    }
    
    public Room getRoom(int ID)
    {
        return roomList.get(ID);
    }
}
