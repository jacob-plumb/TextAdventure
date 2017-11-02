import java.util.HashMap;
public class RoomList
{
    private HashMap<Integer, Room> roomList = new HashMap<Integer, Room>();
    
    RoomList()
    {
        Room churchFoyer = new Room();
        churchFoyer.setName("CHURCH FOYER");
        churchFoyer.setDesc("This is the church foyer.");
        
        Room churchAltar = new Room();
        churchAltar.setName("CHURCH ALTAR");
        churchAltar.setDesc("This is the church's altar room.");
        
        Room churchBellTower = new Room();
        churchBellTower.setName("CHURCH BELL TOWER");
        churchBellTower.setDesc("This is the tower of the church.");
        
        Room centralMarketSquare = new Room();
        centralMarketSquare.setName("CENTRAL MARKET SQUARE");
        centralMarketSquare.setDesc("This is the central market square.");
        
        Room southernMarketSquare = new Room();
        southernMarketSquare.setName("SOUTHERN MARKET SQUARE");
        southernMarketSquare.setDesc("This is the southern market square.");
        
        Room easternMarketSquare = new Room();
        easternMarketSquare.setName("EASTERN MARKET SQUARE");
        easternMarketSquare.setDesc("This is the central market square.");
        
    }
    
    public Room getRoom(int ID)
    {
        return roomList.get(ID);
    }
}
