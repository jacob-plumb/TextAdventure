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
        sword.setValue(20);
        sword.setDamage(1, 6);
        sword.setStrReq(1);
        sword.setDexReq(1);
        sword.setAP(1);
        weaponList.put(sword.getID(), sword);

        Weapon dagger = new Weapon();
        dagger.setName("DAGGER");
        dagger.setDesc("This is a dagger.");
        dagger.setID(102);
        dagger.setValue(10);
        dagger.setDamage(1, 4);
        dagger.setStrReq(1);
        dagger.setDexReq(2);
        dagger.setAP(2);
        weaponList.put(dagger.getID(), dagger);
        
        //possibly a rondel dagger w/ higher AP

        Weapon longsword = new Weapon();
        longsword.setName("LONGSWORD");
        longsword.setDesc("This is a longsword.");
        longsword.setID(103);
        longsword.setValue(35);
        longsword.setDamage(1, 8);
        longsword.setStrReq(3);
        longsword.setDexReq(3);
        longsword.setAP(1);
        weaponList.put(longsword.getID(), longsword);
        
        Weapon estoc = new Weapon();
        estoc.setName("ESTOC");
        estoc.setDesc("This is an estoc.");
        estoc.setID(104);
        estoc.setValue(40);
        estoc.setDamage(1, 8);
        estoc.setStrReq(3);
        estoc.setDexReq(5);
        estoc.setAP(3);
        weaponList.put(estoc.getID(), estoc);
        
        Weapon stick = new Weapon();
        stick.setName("STICK");
        stick.setDesc("This is a stick.");
        stick.setID(100);
        stick.setValue(0);
        stick.setDamage(1, 2);
        stick.setStrReq(0);
        stick.setDexReq(0);
        stick.setAP(0);
        weaponList.put(stick.getID(), stick);
        
        Weapon unarmed = new Weapon();
        unarmed.setName("UNARMED");
        unarmed.setDesc("These are your fists.");
        unarmed.setID(99);
        unarmed.setValue(0);
        unarmed.setDamage(1, 4);
        unarmed.setStrReq(0);
        unarmed.setDexReq(0);
        unarmed.setAP(0);
        weaponList.put(unarmed.getID(), stick);
        
        Weapon dragonSlayer = new Weapon();
        dragonSlayer.setName("DRAGON SLAYER");
        dragonSlayer.setDesc("It is too big to be called a sword. Massive, thick, heavy, and far \n" + 
                            "too rough. Indeed, it is a heap of raw iron.");
        dragonSlayer.setID(199);
        dragonSlayer.setValue(20000);
        dragonSlayer.setDamage(4, 24);
        dragonSlayer.setStrReq(10);
        dragonSlayer.setDexReq(3);
        dragonSlayer.setAP(6);
        weaponList.put(dragonSlayer.getID(), dragonSlayer);
    }

    public Weapon getItem(int ID)
    {
        return weaponList.get(ID);
    }
}
