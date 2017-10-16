public class Room
{
    private String name;
    private String desc;
    
    private Room up;
    private Room down;
    private Room north;
    private Room east;
    private Room south;
    private Room west;
    
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
    
    public Room getNorth()
    {
        return north;
    }
    
    public void setNorth(Room north)
    {
        this.north = north;
    }
    
    public Room getEast()
    {
        return east;
    }
    
    public void setEast(Room east)
    {
        this.east = east;
    }
    
    public Room getSouth()
    {
        return south;
    }
    
    public void setSouth(Room south)
    {
        this.south = south;
    }
    
    public Room getWest()
    {
        return west;
    }
    
    public void setWest(Room west)
    {
        this.west = west;
    }
}
