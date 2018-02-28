public class Consumable extends Collectible
{
    private int uses;
    private int minEffect;
    private int maxEffect;
    private String type;
    
    public int getUses()
    {
        return uses;
    }
    
    public void setUses(int uses)
    {
        this.uses = uses;
    }
    
    public int getMinEffect()
    {
        return minEffect;
    }
    
    public void setMinEffect(int minEffect)
    {
        this.minEffect = minEffect;
    }
    
    public int getMaxEffect()
    {
        return maxEffect;
    }
    
    public void setMaxEffect(int maxEffect)
    {
        this.maxEffect = maxEffect;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public void use(Character user, Character target)
    {
        if(type.equals("thrown"))
        {
            //throwItem
        }
        else if(type.equals("healthPotion") || type.equals("manaPotion"))
        {
            drinkPotion(user);
        }
        
        uses--;
        if(uses == 0)
        {
            this.setAmount(this.getAmount() - 1);
        }
    }
    
    public void throwItem(Character user, Character target)
    {
        
    }
    
    public void drinkPotion(Character user)
    {
        int effect = Dice.roll(minEffect, maxEffect);
        user.healFor(effect, null, this);
    }
}
