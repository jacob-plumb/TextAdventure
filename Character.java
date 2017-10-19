public abstract class Character
{
    //ATTRIBUTES
    private int str;
    private int dex;
    private int con;
    private int know;
    private int wis;
    private int cha;
    
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
        System.out.println("Strength: " + str);
        System.out.println("Dexterity: " + dex);
        System.out.println("Constitution: " + con);
        System.out.println("Knowledge: " + know);
        System.out.println("Wisdom: " + wis);
        System.out.println("Charisma: " + cha);
    }
    
    public void printCombatStats()
    {
        System.out.println("" + name + " Health: " + tempHP);
        System.out.println("" + name + " Magic: " + tempMP);
    }
    
    public void attack(Character attacker, Character target)
    {
        int toHit = (int)((Math.random() * 20) + 1) + attacker.getDex();
        int targetDodge = (int)((((Math.random() * 20) + 1) + target.getDex()) / 2);
        
        if (toHit > targetDodge)
        {
            int damage = (int)((Math.random() * attacker.getWep().getMaxDamage()) + attacker.getWep().getMinDamage());
            target.setTempHP(target.getTempHP() - damage);
            System.out.println("" + attacker.getName() + " hits " + target.getName() + " with their " 
            + attacker.getWep().getName() + " dealing " + damage + " damage!");
        }
        else
        {
            System.out.println("" + attacker.getName() + "'s attack misses!");
        }
    }
    
}
