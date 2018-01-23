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

    public void removeItem(Item item)
    {
        backpack.remove(item);
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

    public void accessMain(Player player)
    {
        System.out.println("INVENTORY");
        System.out.println("1. Weapons");
        System.out.println("2. Armor");
        System.out.println("3. Magic");
        System.out.println("4. Miscellaneous");
        System.out.println("5. Back");
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option == 1)
            {
                accessWeapons(player);
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
                player.printMenu();
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessMain(player);
        }
    }

    public void accessWeapons(Player player)
    {
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons = getWeapons();
        System.out.println("WEAPONS");
        int endNum = 1;
        for(int i = 0; i < weapons.size(); i++)
        {
            System.out.println("" + (i+1) + ". " + weapons.get(i).getName());
            endNum++;
        }
        System.out.println("" + endNum + ". Back");
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            if(option > weapons.size()+1 && option < 1)
            {
                throw new NumberFormatException();
            }
            if(option == endNum)
            {
                this.accessMain(player);
            }
            else
            {
                option--;
                showWeapon(weapons, option, player);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessWeapons(player);
        }
    }

    public void showWeapon(ArrayList<Weapon> list, int index, Player player)
    {
        Weapon weapon = list.get(index);
        System.out.println(weapon.getName());
        System.out.println(weapon.getDesc());
        System.out.println("Damage: " + weapon.getMinDamage() + " to " + weapon.getMaxDamage());
        System.out.println("Value: " + weapon.getValue() + " gold.");
        System.out.println("1. Equip");
        System.out.println("2. Back");

        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option == 1)
            {
                Weapon oldWep = player.getWep();
                addItem(oldWep);
                player.setWep(weaponList.getItem(weapon.getID()));
                removeItem(weapon);
                System.out.println("You equip your " + weapon.getName()); 
            }
            else
            {
                this.accessWeapons(player);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessWeapons(player);
        }
    }
}
