import java.util.HashMap;
public class EffectList
{
    private HashMap<Integer, Effect> effectList = new HashMap<Integer, Effect>();

    EffectList()
    {
        damagingEffect minorFireDot = new damagingEffect();
        minorFireDot.setDuration(3);
        minorFireDot.setDamage(2);
        minorFireDot.setID(101);
        effectList.put(minorFireDot.getID(), minorFireDot);

        damagingEffect minorFireInst = new damagingEffect();
        minorFireInst.setDuration(1);
        minorFireInst.setDamage(6);
        minorFireInst.setID(102);
        effectList.put(minorFireInst.getID(), minorFireInst);
        
        healingEffect minorHealDot = new healingEffect();
        minorHealDot.setDuration(3);
        minorHealDot.setHeal(2);
        minorHealDot.setID(201);
        effectList.put(minorHealDot.getID(), minorHealDot);
        
        healingEffect minorHealInst = new healingEffect();
        minorHealInst.setDuration(1);
        minorHealInst.setHeal(6);
        minorHealInst.setID(202);
        effectList.put(minorHealInst.getID(), minorHealInst);
    }

    public Effect getEffect(int ID)
    {
        return effectList.get(ID);
    }
}
