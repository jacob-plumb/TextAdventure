import java.util.HashMap;
public class SpellList
{
    private HashMap<Integer, Spell> spellList = new HashMap<Integer, Spell>();
    
    EffectList effectList = new EffectList();
    
    SpellList()
    {
        Spell burn = new Spell();
        burn.setName("BURN");
        burn.setID(101);
        burn.setValue(10);
        burn.setManaCost(5);
        burn.setKnowReq(3);
        burn.setEffect(effectList.getEffect(101));
        burn.setDuration(burn.getEffect().getDuration());
        //DESC NOT WORKING BECAUSE .getEffect() returns an Effect, not a damagingEffect -- fix that
    }
    
    public Spell getSpell(int ID)
    {
        return spellList.get(ID);
    }
}
