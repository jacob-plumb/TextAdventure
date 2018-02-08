public class Spell extends Item
{
    private int manaCost;
    private int knowReq;
    private int duration;
    private Effect effect;
    
    public Effect getEffect()
    {
        return effect;
    }
    
    public void setEffect(Effect effect)
    {
        this.effect = effect;
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
}
