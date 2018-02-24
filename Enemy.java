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

    public ArrayList<Spell> getCastableSpells()
    {
        ArrayList<Spell> castable = new ArrayList<Spell>();
        for(Spell s : spells)
        {
            if(s.getManaCost() < this.getTempMP())
            {
                castable.add(s);
            }
        }
        
        return castable;
    }
    
    public Spell selectSpell()
    {
        ArrayList<Spell>castableSpells = this.getCastableSpells();
        if(castableSpells.size() > 0)
        {
            int index = Dice.roll(0, castableSpells.size()-1);
            return castableSpells.get(index);
        }
        else
        {
            return null;
        }
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
