import java.lang.Math;
import java.util.HashMap;
public class SpellList
{
    private HashMap<Integer, Spell> spellList = new HashMap<Integer, Spell>();
    
    SpellList()
    {
        //DAMAGE SPELLS
        Spell burn = new Spell();
        burn.setName("BURN");
        burn.setID(101);
        burn.setValue(50);
        burn.setManaCost(5);
        burn.setKnowReq(3);
        burn.setHE(-1, -3);
        burn.setDuration(3);
        burn.setDesc("This spell deals " + Math.abs(burn.getMinHE()) + " to " + Math.abs(burn.getMaxHE()) + " damage over " + 
                    burn.getDuration() + " turns.");
        spellList.put(burn.getID(), burn);
        
        Spell firebolt = new Spell();
        firebolt.setName("FIREBOLT");
        firebolt.setID(102);
        firebolt.setValue(60);
        firebolt.setManaCost(8);
        firebolt.setKnowReq(3);
        firebolt.setHE(-3, -9);
        firebolt.setDuration(1);
        firebolt.setDesc("This spell deals " + Math.abs(firebolt.getMinHE()) + " to " + Math.abs(firebolt.getMaxHE()) + " damage instantly.");
        spellList.put(firebolt.getID(), firebolt);
        
        Spell conflagrate = new Spell();
        conflagrate.setName("CONFLAGRATE");
        conflagrate.setID(103);
        conflagrate.setValue(175);
        conflagrate.setManaCost(15);
        conflagrate.setKnowReq(8);
        conflagrate.setHE(-1, -6);
        conflagrate.setDuration(4);
        conflagrate.setDesc("This spell deals " + Math.abs(conflagrate.getMinHE()) + " to " + Math.abs(conflagrate.getMaxHE()) + " damage over " + 
                    conflagrate.getDuration() + " turns.");
        spellList.put(conflagrate.getID(), conflagrate);
        
        Spell fireball = new Spell();
        fireball.setName("FIREBALL");
        fireball.setID(104);
        fireball.setValue(250);
        fireball.setManaCost(25);
        fireball.setKnowReq(8);
        fireball.setHE(-4, -24);
        fireball.setDuration(1);
        fireball.setDesc("This spell deals " + Math.abs(fireball.getMinHE()) + " to " + Math.abs(fireball.getMaxHE()) + " damage instantly.");
        spellList.put(fireball.getID(), fireball);
        
        Spell minorDrainLife = new Spell();
        minorDrainLife.setName("MINOR DRAIN LIFE");
        minorDrainLife.setID(111);
        minorDrainLife.setValue(100);
        minorDrainLife.setManaCost(15);
        minorDrainLife.setKnowReq(6);
        minorDrainLife.setHE(-2, -8);
        minorDrainLife.setDuration(1);
        minorDrainLife.setDrain(true);
        firebolt.setDesc("This spell steals " + Math.abs(minorDrainLife.getMinHE()) + " to " + 
                        Math.abs(minorDrainLife.getMaxHE()) + " health instantly and gives it to you.");
        spellList.put(minorDrainLife.getID(), minorDrainLife);
        
        //HEALING SPELLS
        //minor instant heal, medium instant heal, major instant heal
        //minor HoT, medium HoT, major HoT
    }
    
    public Spell getSpell(int ID)
    {
        return spellList.get(ID);
    }
}
