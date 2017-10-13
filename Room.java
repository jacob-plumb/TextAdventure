public class Room
{
    private String name;
    private String desc;
    private Room up;
    private Room down;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
    
    
    //MOVEMENT
    
    public Room getUp()
    {
        return up;
    }
    
    public void setUp(Room up)
    {
        this.up = up;
    }
    
    public Room getDown()
    {
        return down;
    }
    
    public void setDown(Room down)
    {
        this.down = down;
    }
}
