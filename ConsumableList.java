import java.util.HashMap;
public class ConsumableList
{
    private HashMap<Integer, Consumable> conList = new HashMap<Integer, Consumable>();
    
    ConsumableList()
    {
        /*
         * CONSUMABLES:     7XYZ
         * Health potion:   71YZ
         * Mana potion:     72YZ
         * Knife:           73YZ
         * Bomb:            74YZ
         */
        Consumable minorHP = new Consumable();
        minorHP.setName("MINOR HEALTH POTION");
        minorHP.setDesc("This is a minor health potion.");
        minorHP.setValue(10);
        minorHP.setID(7101);
        minorHP.setAmount(1);
        minorHP.setMaxUses(1);
        minorHP.setTempUses(minorHP.getMaxUses());
        minorHP.setMinEffect(1);
        minorHP.setMaxEffect(8);
        minorHP.setType("Potions");
        minorHP.setSubType("Health");
        conList.put(minorHP.getID(), minorHP);
        
        Consumable minorMP = new Consumable();
        minorMP.setName("MINOR MANA POTION");
        minorMP.setDesc("This is a minor mana potion.");
        minorMP.setValue(30);
        minorMP.setID(7201);
        minorMP.setAmount(1);
        minorMP.setMaxUses(1);
        minorMP.setTempUses(minorMP.getMaxUses());
        minorMP.setMinEffect(1);
        minorMP.setMaxEffect(8);
        minorMP.setType("Potions");
        minorMP.setSubType("Mana");
        conList.put(minorMP.getID(), minorMP);
        
        Consumable smallKnife = new Consumable();
        smallKnife.setName("SMALL THROWING KNIFE");
        smallKnife.setDesc("This is a small throwing knife.");
        smallKnife.setValue(2);
        smallKnife.setID(7301);
        smallKnife.setAmount(1);
        smallKnife.setMaxUses(1);
        smallKnife.setTempUses(smallKnife.getMaxUses());
        smallKnife.setMinEffect(1);
        smallKnife.setMaxEffect(4);
        smallKnife.setType("Thrown");
        smallKnife.setSubType("Knife");
        conList.put(smallKnife.getID(), smallKnife);
        
        Consumable fireBomb = new Consumable();
        fireBomb.setName("FIREBOMB");
        fireBomb.setDesc("This is a firebomb.");
        fireBomb.setValue(20);
        fireBomb.setID(7401);
        fireBomb.setAmount(1);
        fireBomb.setMaxUses(1);
        fireBomb.setTempUses(fireBomb.getMaxUses());
        fireBomb.setMinEffect(2);
        fireBomb.setMaxEffect(8);
        fireBomb.setType("Thrown");
        fireBomb.setSubType("Firebomb");
        conList.put(fireBomb.getID(), fireBomb);
    }
    
    public Consumable getItem(int ID)
    {
        return conList.get(ID);
    }
}
