import java.lang.Math;
import java.util.HashMap;
public class SpellList
{
    private HashMap<Integer, Spell> spellList = new HashMap<Integer, Spell>();
    
    SpellList()
    {
        /*
         * SPELLS:      2XYZ
         * DoT:         21XY
         * Damage:      22XY
         * Drain:       23XY
         * HoT:         24XY
         * Heal:        25XY
         */
        
        //DAMAGE SPELLS
        Spell burn = new Spell();
        burn.setName("BURN");
        burn.setID(2101);
        burn.setValue(50);
        burn.setManaCost(5);
        burn.setKnowReq(3);
        burn.setHE(-1, -3);
        burn.setDuration(3);
        burn.setDesc("This spell deals " + Math.abs(burn.getMinHE()) + " to " + Math.abs(burn.getMaxHE()) + " damage over " + 
                    burn.getDuration() + " turns.");
                    
        spellList.put(burn.getID(), burn);
        Spell conflagrate = new Spell();
        conflagrate.setName("CONFLAGRATE");
        conflagrate.setID(2102);
        conflagrate.setValue(175);
        conflagrate.setManaCost(15);
        conflagrate.setKnowReq(8);
        conflagrate.setHE(-1, -6);
        conflagrate.setDuration(4);
        conflagrate.setDesc("This spell deals " + Math.abs(conflagrate.getMinHE()) + " to " + Math.abs(conflagrate.getMaxHE()) + " damage over " + 
                    conflagrate.getDuration() + " turns.");
                    
        spellList.put(conflagrate.getID(), conflagrate);
        Spell firebolt = new Spell();
        firebolt.setName("FIREBOLT");
        firebolt.setID(2201);
        firebolt.setValue(60);
        firebolt.setManaCost(8);
        firebolt.setKnowReq(3);
        firebolt.setHE(-3, -9);
        firebolt.setDuration(1);
        firebolt.setDesc("This spell deals " + Math.abs(firebolt.getMinHE()) + " to " + Math.abs(firebolt.getMaxHE()) + " damage instantly.");
        spellList.put(firebolt.getID(), firebolt);
        
        Spell fireball = new Spell();
        fireball.setName("FIREBALL");
        fireball.setID(2202);
        fireball.setValue(250);
        fireball.setManaCost(25);
        fireball.setKnowReq(8);
        fireball.setHE(-4, -24);
        fireball.setDuration(1);
        fireball.setDesc("This spell deals " + Math.abs(fireball.getMinHE()) + " to " + Math.abs(fireball.getMaxHE()) + " damage instantly.");
        spellList.put(fireball.getID(), fireball);
        
        Spell drainLife = new Spell();
        drainLife.setName("DRAIN LIFE");
        drainLife.setID(2301);
        drainLife.setValue(100);
        drainLife.setManaCost(15);
        drainLife.setKnowReq(6);
        drainLife.setHE(-2, -8);
        drainLife.setDuration(1);
        drainLife.setDrain(true);
        firebolt.setDesc("This spell steals " + Math.abs(drainLife.getMinHE()) + " to " + 
                        Math.abs(drainLife.getMaxHE()) + " health instantly and gives it to you.");
        spellList.put(drainLife.getID(), drainLife);
        
        //HEALING SPELLS
        //still needs major HoT & instant heal
        Spell healingWord = new Spell();
        healingWord.setName("HEALING WORD");
        healingWord.setID(2401);
        healingWord.setValue(70);
        healingWord.setManaCost(8);
        healingWord.setKnowReq(4);
        healingWord.setHE(3, 9);
        healingWord.setDuration(1);
        healingWord.setAP(10);
        healingWord.setDesc("This spell heals the caster for" + healingWord.getMinHE() + " to " + 
                            healingWord.getMaxHE() + " health instantly.");
        spellList.put(healingWord.getID(), healingWord);
        
        Spell renew = new Spell();
        renew.setName("RENEW");
        renew.setID(2501);
        renew.setValue(60);
        renew.setManaCost(5);
        renew.setKnowReq(4);
        renew.setHE(1, 3);
        renew.setDuration(3);
        renew.setDesc("This spell heals the caster for " + renew.getMinHE() + " to " + renew.getMaxHE() + " health over " + 
                      renew.getDuration() + " turns.");
        spellList.put(renew.getID(), renew);
        
        //MAKE SPELLS THAT IGNORE ARMOR
    }
    
    public Spell getSpell(int ID)
    {
        return spellList.get(ID);
    }
}
