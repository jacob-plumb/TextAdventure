public class Weapon extends Item
{
    private int minDamage;
    private int maxDamage;
    private int strReq;
    private int dexReq;
    private int armorPenetration;
    
    public int getMinDamage()
    {
        return minDamage;
    }
    
    public int getMaxDamage()
    {
        return maxDamage;
    }
    
    public void setDamage(int minDamage, int maxDamage)
    {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
    
    public int getStrReq()
    {
        return strReq;
    }
    
    public void setStrReq(int strReq)
    {
        this.strReq = strReq;
    }
    
    public int getDexReq()
    {
        return dexReq;
    }
    
    public void setDexReq(int dexReq)
    {
        this.dexReq = dexReq;
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
