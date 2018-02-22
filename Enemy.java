import java.util.ArrayList;
public class Enemy extends Character
{
    private int id;
    private ArrayList<Spell> spells;
    private int minGold;
    private int maxGold;
    
    public int getID()
    {
        return id;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    
    public ArrayList<Spell> getSpells()
    {
        return spells;
    }
    
    public void addSpell(Spell spell)
    {
        try
        {
            spells.add(spell);
        }
        catch (NullPointerException e)
        {
            spells = new ArrayList<Spell>();
            spells.add(spell);
        }
    }
    
    public void setSpells(ArrayList<Spell> spells)
    {
        this.spells = spells;
    }
    
    public void setGold(int minGold, int maxGold)
    {
        this.minGold = minGold;
        this.maxGold = maxGold;
    }
    
    public int dropGold()
    {
        return Dice.roll(minGold, maxGold);
    }
}
