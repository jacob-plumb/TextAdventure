public class Player
{
    private Room currentRoom;
    
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
    
    public void playerMove(Room newRoom)
    {
        if(newRoom != null)
        {
            currentRoom = newRoom;
        }
    }
}
