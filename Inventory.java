import java.util.ArrayList;
import java.util.List;

public class Inventory
{
    private ArrayList<Item> backpack;
    //arraylist of magic

    public Inventory()
    {
        backpack = new ArrayList<Item>();
    }

    public void addItem(Item item)
    {
        backpack.add(item);
    }
    
    public Item getItem(int index)
    {
        return backpack.get(index);
    }
    
    public ArrayList<Weapon> getWeapons(){
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        for (Item item : backpack)
        {
            if (item instanceof Weapon)
            {
                weapons.add(0,(Weapon) item);
            }
        }
        return weapons;
    }
    
    public ArrayList<Armor> getArmors(){
        ArrayList<Armor> armors = new ArrayList<Armor>();
        for (Item item : backpack)
        {
            if (item instanceof Armor)
            {
                armors.add(0,(Armor) item);
            }
        }
        return armors;
    }
    
    //create getters for magic arrays and misc arrays once classes created
    
    /*
     * ArrayList<Weapons> = backpack.getWeapons()
     * show options
     * select
     * end 
     */
}
