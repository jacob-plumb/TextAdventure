public class MetaList
{
    private static WeaponList weaponList = new WeaponList();
    private static ArmorList armorList = new ArmorList();
    private static SpellList spellList = new SpellList();
    private static MiscItemList miscItemList = new MiscItemList();
    private static ConsumableList conList = new ConsumableList();
    
    public static void getObject(int ID)
    {
        if(ID >= 1000 && ID < 1500)
        {
            getWeapon(ID);
        }
        else if(ID >= 1500 && ID < 2000)
        {
            getArmor(ID);
        }
        else if(ID >= 2000 && ID < 3000)
        {
            getSpell(ID);
        }
        else if(ID >= 3000 && ID < 4000)
        {
            getMiscItem(ID);
        }
        else if(ID >= 7000 && ID < 8000)
        {
            getConsumable(ID);
        }
    }
    
    public static Weapon getWeapon(int ID)
    {
        return weaponList.getItem(ID);
    }
    
    public static Armor getArmor(int ID)
    {
        return armorList.getItem(ID);
    }
    
    public static Spell getSpell(int ID)
    {
        return spellList.getSpell(ID);
    }
    
    public static MiscItem getMiscItem(int ID)
    {
        return miscItemList.getItem(ID);
    }
    
    public static Consumable getConsumable(int ID)
    {
        return conList.getItem(ID);
    }
}
