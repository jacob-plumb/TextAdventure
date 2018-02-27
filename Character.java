import java.util.ArrayList;
import java.lang.Math;
public abstract class Character
{
    //ATTRIBUTES
    private int[] att = new int[6];

    //HEALTH/MANA
    private int maxHP;
    private int tempHP;
    private int maxMP;
    private int tempMP;

    //STATS
    private String name;
    private int level;
    private int gold;
    private int xp;

    //INVENTORY
    private Weapon currentWep;
    private Armor currentArmor;

    //PLAYER ATTRIBUTES
    public int[] getAtt()
    {
        return att;
    }

    public void setAtt(int str, int dex, int con, int know, int wis, int cha)
    {
        att[0] = str;
        att[1] = dex;
        att[2] = con;
        att[3] = know;
        att[4] = wis;
        att[5] = cha;
    }

    public int getStr()
    {
        return att[0];
    }

    public void setStr(int str)
    {
        att[0] = str;
    }

    public int getDex()
    {
        return att[1];
    }

    public void setDex(int dex)
    {
        att[1] = dex;
    }

    public int getCon()
    {
        return att[2];
    }

    public void setCon(int con)
    {
        att[2] = con;
    }

    public int getKnow()
    {
        return att[3];
    }

    public void setKnow(int know)
    {
        att[3] = know;
    }

    public int getWis()
    {
        return att[4];
    }

    public void setWis(int wis)
    {
        att[4] = wis;
    }

    public int getCha()
    {
        return att[5];
    }

    public void setCha(int cha)
    {
        att[5] = cha;
    }

    //HEALTH/MANA
    public int getMaxHP()
    {
        return maxHP;
    }

    public void setMaxHP(int maxHP)
    {
        this.maxHP = maxHP;
    }

    public int getTempHP()
    {
        return tempHP;
    }

    public void setTempHP(int tempHP)
    {
        this.tempHP = tempHP;
    }

    public int getTempMP()
    {
        return tempMP;
    }

    public void setTempMP(int tempMP)
    {
        this.tempMP = tempMP;
    }

    public int getMaxMP()
    {
        return maxMP;
    }

    public void setMaxMP(int maxMP)
    {
        this.maxMP = maxMP;
    }

    public void calcMaxHP()
    {
        maxHP = (this.getCon() * 3) + (this.getLevel() * 5);
    }

    //STATS

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
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

    //INVENTORY
    public Weapon getWep()
    {
        return currentWep;
    }

    public void setWep(Weapon currentWep)
    {
        this.currentWep = currentWep;
    }

    public Armor getArmor()
    {
        return currentArmor;
    }

    public void setArmor(Armor currentArmor)
    {
        this.currentArmor = currentArmor;
    }

    protected void printStats()
    {
        /**@Override
         * 
         */
        System.out.println("Health: " + tempHP);
        System.out.println("Magic: " + tempMP);
        System.out.println("Gold: " + gold);
        System.out.println("XP: " + xp);
        System.out.println("Strength: " + att[0]);
        System.out.println("Dexterity: " + att[1]);
        System.out.println("Constitution: " + att[2]);
        System.out.println("Knowledge: " + att[3]);
        System.out.println("Wisdom: " + att[4]);
        System.out.println("Charisma: " + att[5]);
        System.out.println("Weapon: " + currentWep.getName());
        System.out.println("Armor: " + currentArmor.getName());
    }

    public void printCombatStats()
    {
        System.out.println("" + name + " Health: " + tempHP);
        System.out.println("" + name + " Magic: " + tempMP);
    }

    //Target uses half dex to dodge; attacker uses half str to damage
    public void lightAttack(Character attacker, Character target)
    {
        double strMod = 1;
        double dexMod = 1;

        if(attacker.getStr() < attacker.getWep().getStrReq())
        {
            strMod = 0.5;
        }
        if(attacker.getDex() < attacker.getWep().getDexReq())
        {
            dexMod = 0.5;
        }

        int toHit = (int)((Dice.roll(1, 20) + attacker.getDex()) * dexMod);
        int targetDodge = Dice.roll(1, 20) + (target.getDex() / 2);

        if (toHit > targetDodge)
        {
            int damage = Dice.roll(attacker.getWep().getMinDamage(), attacker.getWep().getMaxDamage()) + (attacker.getStr() / 2);
            damage = (int)(damage * strMod);
            target.takeDamage(damage, attacker, null);
        }
        else
        {
            System.out.println("" + attacker.getName() + "'s attack misses!");
        }
    }

    //Target uses full dex to dodge; attacker uses full str to damage
    public void heavyAttack(Character attacker, Character target)
    {
        double strMod = 1;
        double dexMod = 1;

        if(attacker.getStr() < attacker.getWep().getStrReq())
        {
            strMod = 0.5;
        }
        if(attacker.getDex() < attacker.getWep().getDexReq())
        {
            dexMod = 0.5;
        }

        int toHit = (int)((Dice.roll(1, 20) + attacker.getDex()) * dexMod);
        int targetDodge = Dice.roll(1, 20) + target.getDex();

        if (toHit > targetDodge)
        {
            int damage = Dice.roll(attacker.getWep().getMinDamage(), attacker.getWep().getMaxDamage()) + attacker.getStr();
            damage = (int)(damage * strMod);
            target.takeDamage(damage, attacker, null);
        }
        else
        {
            System.out.println("" + attacker.getName() + "'s attack misses!");
        }
    }

    public int[] castSpell(Character attacker, Character target, Spell spell)
    {
        int toHit = Dice.roll(1, 20) + attacker.getDex();
        int targetDodge = Dice.roll(1, 20) + (target.getDex() / 2);
        int duration = spell.getDuration();
        int effect;

        attacker.setTempMP(attacker.getTempMP() - spell.getManaCost());
        //healing spell cast
        if(spell.getMinHE() > 0)
        {
            effect = Dice.roll(spell.getMinHE(), spell.getMaxHE()) + attacker.getKnow();
            attacker.healFor(effect, spell);
        }
        //damage spell cast
        else if (toHit > targetDodge)
        {
            effect = Dice.roll(spell.getMinHE(), spell.getMaxHE()) - attacker.getKnow();
            target.takeDamage(Math.abs(effect), attacker, spell);
        }
        else
        {
            System.out.println("" + attacker.getName() + "'s spell misses!");
            effect = 0;
            return null;
        }
        duration--;

        if(duration > 0)
        {
            int[] values = new int[3];
            values[0] = duration;
            values[1] = spell.getMinHE();
            values[2] = spell.getMaxHE();
            return values;
        }
        else
        {
            return null;
        }
    }

    public void takeDamage(int damage, Character attacker, Spell spell)
    {
        //no spell, normal attack
        if(spell == null)
        {
            int armor = this.getArmor().getArmorValue();
            String blockedString;
            if(armor - attacker.getWep().getAP() <= 0)
            {
                armor = 0;
                blockedString = "";
            }
            else
            {
                armor -= attacker.getWep().getAP();
                blockedString = (" (" + armor + " damage blocked)");
            }

            if(armor > damage)
            {
                damage = 0;
            }
            else
            {
                damage = damage - armor;
            }

            this.setTempHP(this.getTempHP() - damage);
            System.out.println("" + attacker.getName() + " hits " + this.getName() + " with their " 
                + attacker.getWep().getName() + " dealing " + damage + " damage!" + blockedString);
        }
        //spell was cast
        else
        {
            int armor = this.getArmor().getArmorValue();
            String blockedString;
            if(armor - spell.getAP() <= 0)
            {
                armor = 0;
                blockedString = "";
            }
            else
            {
                armor -= spell.getAP();
                blockedString = (" (" + armor + " damage blocked)");
            }
            
            if(armor <= 0)
            {
                blockedString = "";
            }

            if(armor > damage)
            {
                damage = 0;
            }
            else
            {
                damage = damage - armor;
            }
            
            this.setTempHP(this.getTempHP() - damage);

            if(spell.isDrain())
            {
                if((attacker.getTempHP() + damage) > attacker.getMaxHP())
                {
                    attacker.setTempHP(attacker.getMaxHP());
                }
                else
                {
                    attacker.setTempHP(attacker.getTempHP() + damage);
                }
                System.out.println("" + attacker.getName() + " casts " + spell.getName() + " at " 
                    + this.getName() + " and steals " + damage + " health!");
            }
            else
            {
                System.out.println("" + attacker.getName() + " deals " + damage + " damage to " 
                    + this.getName() + " with " + spell.getName() + blockedString);
            }
        }
    }

    public void healFor(int heal, Spell spell)
    {
        if((this.getTempHP() + heal) > this.getMaxHP())
        {
            this.setTempHP(this.getMaxHP());
            System.out.println("" + this.getName() + " heals themselves with " + spell.getName()
                + " to full health.");
        }
        else
        {
            this.setTempHP(this.getTempHP() + heal);
            System.out.println("" + this.getName() + " heals themselves with " + spell.getName()
                + " for " + heal + " health.");
        }
    }

}
