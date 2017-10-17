public class Character
{
    private int maxHP;
    private int tempHP;
    private int maxMP;
    private int tempMP;

    private Room currentRoom;
    
    public Character(Room currentRoom)
    {
        this.currentRoom = currentRoom;
    }
    
    public int getMaxHP()
    {
        return maxHP;
    }
    
    public void setMaxHP(int maxHP)
    {
        this.maxHP = maxHP;
    }
    
    public int getTempHP()
    {
        return tempHP;
    }
    
    public void setTempHP(int tempHP)
    {
        this.tempHP = tempHP;
    }
    
    public int getTempMP()
    {
        return tempMP;
    }
    
    public void setTempMP(int tempMP)
    {
        this.tempMP = tempMP;
    }
    
    public int getMaxMP()
    {
        return maxMP;
    }
    
    public void setMaxMP(int maxMP)
    {
        this.maxMP = maxMP;
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
    
    void printStats(){
        System.out.println("Health: " + tempHP);
        System.out.println("Magic: " + tempMP);
    }
    
    public void playerMove(Room newRoom)
    {
        if(newRoom != null)
        {
            currentRoom = newRoom;
        }
    }
}
