public class Spell extends Item
{
    private int manaCost;
    private int knowReq;
    private int duration;
    private int minHE;
    private int maxHE;
    private boolean drain = false;
    //no DoT can ingnore armor
    private int armorPenetration = 0;
    
    public int getMinHE()
    {
        return minHE;
    }
    
    public int getMaxHE()
    {
        return maxHE;
    }
    
    public void setHE(int minHE, int maxHE)
    {
        this.minHE = minHE;
        this.maxHE = maxHE;
    }
    
    public int getManaCost()
    {
        return manaCost;
    }
    
    public void setManaCost(int manaCost)
    {
        this.manaCost = manaCost;
    }
    
    public int getKnowReq()
    {
        return knowReq;
    }
    
    public void setKnowReq(int knowReq)
    {
        this.knowReq = knowReq;
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    
    public boolean isDrain()
    {
        return drain;
    }
    
    public void setDrain(boolean drain)
    {
        this.drain = drain;
    }
    
    public int getAP()
    {
        return armorPenetration;
    }
    
    public void setAP(int armorPenetration)
    {
        this.armorPenetration = armorPenetration;
    }
}
