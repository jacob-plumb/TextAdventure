public class Consumable extends Collectible
{
    private int maxUses;
    private int tempUses;
    private int minEffect;
    private int maxEffect;
    private int armorPenetration = 0;
    private String type;
    private String subType;

    public int getMaxUses()
    {
        return maxUses;
    }

    public void setMaxUses(int maxUses)
    {
        this.maxUses = maxUses;
    }

    public int getTempUses()
    {
        return tempUses;
    }

    public void setTempUses(int tempUses)
    {
        this.tempUses = tempUses;
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

    public int getAP()
    {
        return armorPenetration;
    }

    public void setAP(int armorPenetration)
    {
        this.armorPenetration = armorPenetration;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getSubType()
    {
        return subType;
    }
    
    public void setSubType(String subType)
    {
        this.subType = subType;
    }

    //returns whether or not the item can be used (ie. if there is an object to be uses)
    public boolean use(Character user, Character target)
    {
        if(this.getAmount() > 0)
        {
            if(type.equals("Thrown"))
            {
                throwItem(user, target);
            }
            else if(type.equals("Potions"))
            {
                drinkPotion(user);
            }

            tempUses--;
            if(tempUses == 0)
            {
                this.setAmount(this.getAmount() - 1);
                if(this.getAmount() > 0)
                {
                    this.setTempUses(maxUses);
                }
            }

            if(this.getAmount() == 0 && (user instanceof Player))
            {
                Player player = (Player)user;
                player.getInventory().removeItem(this);
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public void throwItem(Character user, Character target)
    {
        int toHit = Dice.roll(1, 20) + user.getDex();
        int targetDodge = Dice.roll(1, 20) + (target.getDex() / 2);

        if(toHit > targetDodge)
        {
            int damage = 0;
            if(subType.equals("knife"))
            {
                damage = Dice.roll(minEffect, maxEffect) + (user.getStr() / 2);
            }
            else if(subType.equals("bomb"))
            {
                damage = Dice.roll(minEffect, maxEffect) + (user.getKnow() / 2);
            }

            target.takeDamage(damage, user, null, this);
        }
        else
        {
            System.out.println("" + user.getName() + "'s attack misses!");
        }
    }

    public void drinkPotion(Character user)
    {
        int effect = Dice.roll(minEffect, maxEffect);
        user.healFor(effect, null, this);
    }
}
