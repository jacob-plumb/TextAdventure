public class Room
{
    private String name;
    private String desc;
    private int ID;
    
    private Enemy enemy;
    
    //Potential boolean for whether or not a room is hostile
    
    private int up;
    private int down;
    private int north;
    private int east;
    private int south;
    private int west;
    
    public int getID()
    {
        return ID;
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
    }
    
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
    
    public Enemy getEnemy()
    {
        return enemy;
    }
    
    public void setEnemy(Enemy enemy)
    {
        this.enemy = enemy;
    }
    
    //MOVEMENT
    
    public int getUp()
    {
        return up;
    }
    
    public void setUp(int up)
    {
        this.up = up;
    }
    
    public int getDown()
    {
        return down;
    }
    
    public void setDown(int down)
    {
        this.down = down;
    }
    
    public int getNorth()
    {
        return north;
    }
    
    public void setNorth(int north)
    {
        this.north = north;
    }
    
    public int getEast()
    {
        return east;
    }
    
    public void setEast(int east)
    {
        this.east = east;
    }
    
    public int getSouth()
    {
        return south;
    }
    
    public void setSouth(int south)
    {
        this.south = south;
    }
    
    public int getWest()
    {
        return west;
    }
    
    public void setWest(int west)
    {
        this.west = west;
    }
}
