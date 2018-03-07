public class Room
{
    private String name;
    private String desc;
    private int ID;
    
    private Enemy enemy;
    private NPC npc;
    
    //Potential boolean for whether or not a room is hostile
    
    private int up;
    private int down;
    private int north;
    private int east;
    private int south;
    private int west;
    
    EnemyList enemyList = new EnemyList();
    
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
        if(enemy == null)
        {
            return null;
        }
        return enemy;
    }
    
    public void setEnemy(int enemyID)
    {
        if (enemyID == 0)
        {
            this.enemy = null;
        }
        else
        {
            this.enemy = enemyList.getEnemy(enemyID);
        }
    }
    
    public NPC getNPC()
    {
        return npc;
    }
    
    public void setNPC(NPC npc)
    {
        this.npc = npc;
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
