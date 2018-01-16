import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory
{
    private ArrayList<Item> backpack;
    
    Scanner scanner = new Scanner(System.in);
    WeaponList weaponList = new WeaponList();
    ArmorList armorList = new ArmorList();
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
    
    public ArrayList<Weapon> getWeapons()
    {
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
    
    public ArrayList<Armor> getArmors()
    {
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
    
    //CREATE METHODS FOR ARMOR, MAGIC, MISC
    //TEST
    
    public void accessMain()
    {
        System.out.println("INVENTORY");
        System.out.println("1. Weapons");
        System.out.println("2. Armor");
        System.out.println("3. Magic");
        System.out.println("4. Miscellaneous");
        System.out.println("5. Exit");
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            
            if (option == 1)
            {
                //Weapons
            }
            else if (option == 2)
            {
                //Armor
            }
            else if (option == 3)
            {
                //Magic
            }
            else if (option == 4)
            {
                //Miscellaneous
            }
            else
            {
                //Exit
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessMain();
        }
    }
    
    public void accessWeapons()
    {
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons = getWeapons();
        for(int i = 0; i < weapons.size(); i++)
        {
            System.out.println("" + (i+1) + ". " + weapons.get(i).getName());
        }
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            if(option > weapons.size() && option < 1)
            {
                throw new NumberFormatException();
            }
            option--;
            showWeapon(weapons, option);
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessWeapons();
        }
    }
    
    public void showWeapon(ArrayList<Weapon> list, int index)
    {
        Weapon weapon = list.get(index);
        System.out.println(weapon.getName());
        System.out.println(weapon.getDesc());
        System.out.println("Damage: " + weapon.getMinDamage() + " to " + weapon.getMaxDamage());
        System.out.println("Value: " + weapon.getValue() + " gold.");
        
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            
            if (option == 1)
            {
                //Equip
            }
            else
            {
                //Exit
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessWeapons();
        }
    }
}
