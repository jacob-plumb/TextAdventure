public class Weapon extends Item
{
    private int minDamage;
    private int maxDamage;
    
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
}
