import java.util.HashMap;
public class WeaponList
{
    private HashMap<Integer, Weapon> weaponList = new HashMap<Integer, Weapon>();

    //USE HASHMAP, SET BY KEY(int) AND VALUE(weapon)

    WeaponList()
    {
        Weapon sword = new Weapon();
        sword.setName("SWORD");
        sword.setDesc("This is a sword.");
        sword.setID(101);
        sword.setValue(5);
        sword.setDamage(1, 8);
        weaponList.put(sword.getID(), sword);

        Weapon rustySword = new Weapon();
        rustySword.setName("RUSTY SWORD");
        rustySword.setDesc("This is a rusty sword.");
        rustySword.setID(102);
        rustySword.setValue(1);
        rustySword.setDamage(1, 5);
        weaponList.put(rustySword.getID(), rustySword);

        Weapon qualitySword = new Weapon();
        qualitySword.setName("QUALITY SWORD");
        qualitySword.setDesc("This is a quality sword.");
        qualitySword.setID(103);
        qualitySword.setValue(5);
        qualitySword.setDamage(1, 10);
        weaponList.put(qualitySword.getID(), qualitySword);

    }

    public Weapon getItem(int ID)
    {
        return weaponList.get(ID);
    }
}
