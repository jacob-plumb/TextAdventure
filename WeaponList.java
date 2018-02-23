import java.util.HashMap;
public class WeaponList
{
    private HashMap<Integer, Weapon> weaponList = new HashMap<Integer, Weapon>();

    WeaponList()
    {
        //separate swords IDs from dagger IDs
        Weapon sword = new Weapon();
        sword.setName("SWORD");
        sword.setDesc("This is a sword.");
        sword.setID(101);
        sword.setValue(5);
        sword.setDamage(1, 6);
        sword.setStrReq(1);
        sword.setAP(1);
        weaponList.put(sword.getID(), sword);

        Weapon dagger = new Weapon();
        dagger.setName("DAGGER");
        dagger.setDesc("This is a dagger.");
        dagger.setID(102);
        dagger.setValue(1);
        dagger.setDamage(1, 4);
        dagger.setStrReq(1);
        dagger.setAP(2);
        weaponList.put(dagger.getID(), dagger);
        
        //possibly a rondel dagger w/ higher AP

        Weapon longsword = new Weapon();
        longsword.setName("LONGSWORD");
        longsword.setDesc("This is a longsword.");
        longsword.setID(103);
        longsword.setValue(5);
        longsword.setDamage(1, 8);
        longsword.setStrReq(3);
        longsword.setAP(1);
        weaponList.put(longsword.getID(), longsword);
        
        Weapon stick = new Weapon();
        stick.setName("STICK");
        stick.setDesc("This is a stick.");
        stick.setID(100);
        stick.setValue(0);
        stick.setDamage(1, 2);
        stick.setStrReq(0);
        stick.setAP(0);
        weaponList.put(stick.getID(), stick);
        
        Weapon dragonSlayer = new Weapon();
        dragonSlayer.setName("DRAGON SLAYER");
        dragonSlayer.setDesc("It is too big to be called a sword. Massive, thick, heavy, and far \n" + 
                            "too rough. Indeed, it is a heap of raw iron.");
        dragonSlayer.setID(199);
        dragonSlayer.setValue(20000);
        dragonSlayer.setDamage(4, 24);
        dragonSlayer.setStrReq(10);
        dragonSlayer.setAP(6);
        weaponList.put(dragonSlayer.getID(), dragonSlayer);
    }

    public Weapon getItem(int ID)
    {
        return weaponList.get(ID);
    }
}
