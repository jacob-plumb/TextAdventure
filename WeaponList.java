import java.util.ArrayList;
public class WeaponList
{
    private ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
    
    //USE HASHMAP, SET BY KEY(int) AND VALUE(weapon)
    
    WeaponList()
    {
       Weapon sword = new Weapon();
       sword.setName("SWORD");
       sword.setDesc("This is a sword.");
       sword.setID(101);
       sword.setValue(5);
       sword.setDamage(1, 8);
       weaponList.add(sword);
       
       Weapon rustySword = new Weapon();
       rustySword.setName("RUSTY SWORD");
       rustySword.setDesc("This is a rusty sword.");
       rustySword.setID(102);
       rustySword.setValue(1);
       rustySword.setDamage(1, 5);
       weaponList.add(rustySword);
       
       Weapon betterSword = new Weapon();
       betterSword.setName("BETTER SWORD");
       betterSword.setDesc("This is a better sword.");
       betterSword.setID(103);
       betterSword.setValue(5);
       betterSword.setDamage(1, 10);
       weaponList.add(betterSword);;
      
    }
    
    public Weapon getItem(int ID)
    {
        for (Weapon w : weaponList)
        {
            if (w.getID() == ID)
            {
                return w;
            }
        }
        return null;
    }
}
