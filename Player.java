public class Player extends Character
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
    
    public void printStats(){
        System.out.println("PLAYER STATS");
        super.printStats();
    }
    
    public void playerMove(Room newRoom)
    {
        if(newRoom != null)
        {
            currentRoom = newRoom;
        }
    }
}
