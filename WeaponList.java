import java.util.ArrayList;
public class WeaponList
{
    private ArrayList<Weapon> list = new ArrayList<Weapon>();
    
    WeaponList()
    {
       Weapon sword = new Weapon();
       sword.setName("SWORD");
       sword.setDesc("This is a sword.");
       sword.setID(101);
       sword.setValue(5);
       sword.setDamage(1, 8);
       list.add(sword);
       
       Weapon rustySword = new Weapon();
       sword.setName("RUSTY SWORD");
       sword.setDesc("This is a rusty sword.");
       sword.setID(102);
       sword.setValue(1);
       sword.setDamage(1, 5);
       list.add(rustySword);
       
       Weapon betterSword = new Weapon();
       sword.setName("BETTER SWORD");
       sword.setDesc("This is a better sword.");
       sword.setID(103);
       sword.setValue(5);
       sword.setDamage(1, 10);
       list.add(betterSword);
      
    }
    
    public Weapon getItem(int ID)
    {
        for (Weapon w : list)
        {
            if (w.getID() == ID)
            {
                return w;
            }
        }
        return null;
    }
}
