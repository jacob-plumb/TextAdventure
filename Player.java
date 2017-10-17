public class Player extends Character
{
    //ATTRIBUTES
    private int str;
    private int dex;
    private int con;
    private int know;
    private int wis;
    private int cha;
    
    //STATS
    private int gold;
    private int xp;

    public Player(Room room){
        super(room);
    }
    //PLAYER ATTRIBUTES/STATS
    public int getStr()
    {
        return str;
    }
    
    public void setStr(int str)
    {
        this.str = str;
    }
    
    public int getDex()
    {
        return dex;
    }
    
    public void setDex(int dex)
    {
        this.dex = dex;
    }
    
    public int getCon()
    {
        return con;
    }
    
    public void setCon(int con)
    {
        this.con = con;
    }
    
    public int getKnow()
    {
        return know;
    }
    
    public void setKnow(int know)
    {
        this.know = know;
    }
    
    public int getWis()
    {
        return wis;
    }
    
    public void setWis(int wis)
    {
        this.wis = wis;
    }
    
    public int getCha()
    {
        return cha;
    }
    
    public void setCha(int cha)
    {
        this.cha = cha;
    }
    
    public int getGold()
    {
        return gold;
    }
    
    public void setGold(int gold)
    {
        this.gold = gold;
    }
    
    public int getXP()
    {
        return xp;
    }
    
    public void setXP(int xp)
    {
        this.xp = xp;
    }
    
    
    
    public void printStats()
    {
        System.out.println();
        System.out.println("PLAYER STATS");
        super.printStats();
        System.out.println("Gold: " + gold);
        System.out.println("XP: " + xp);
        System.out.println("Strength: " + str);
        System.out.println("Dexterity: " + dex);
        System.out.println("Constitution: " + con);
        System.out.println("Knowledge: " + know);
        System.out.println("Wisdom: " + wis);
        System.out.println("Charisma: " + cha);
    }
    
    //PLAYER-ROOM STUFF
    
    
    
}
