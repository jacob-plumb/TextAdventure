import java.util.HashMap;
public class WeaponList
{
    private HashMap<Integer, Weapon> weaponList = new HashMap<Integer, Weapon>();

    WeaponList()
    {
        Weapon sword = new Weapon();
        sword.setName("SWORD");
        sword.setDesc("This is a sword.");
        sword.setID(101);
        sword.setValue(5);
        sword.setDamage(1, 6);
        weaponList.put(sword.getID(), sword);

        Weapon rustySword = new Weapon();
        rustySword.setName("RUSTY SWORD");
        rustySword.setDesc("This is a rusty sword.");
        rustySword.setID(102);
        rustySword.setValue(1);
        rustySword.setDamage(1, 4);
        weaponList.put(rustySword.getID(), rustySword);

        Weapon fineSword = new Weapon();
        fineSword.setName("FINE SWORD");
        fineSword.setDesc("This is a fine sword.");
        fineSword.setID(103);
        fineSword.setValue(5);
        fineSword.setDamage(1, 8);
        weaponList.put(fineSword.getID(), fineSword);
        
        Weapon dragonSlayer = new Weapon();
        dragonSlayer.setName("DRAGON SLAYER");
        dragonSlayer.setDesc("It is too big to be called a sword. Massive, thick, heavy, and far \n" + 
                            "too rough. Indeed, it is a heap of raw iron.");
        dragonSlayer.setID(199);
        dragonSlayer.setValue(20000);
        dragonSlayer.setDamage(4, 24);
        weaponList.put(dragonSlayer.getID(), dragonSlayer);
    }

    public Weapon getItem(int ID)
    {
        return weaponList.get(ID);
    }
}
