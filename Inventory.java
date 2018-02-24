import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory
{
    private ArrayList<Item> backpack;

    Scanner scanner = new Scanner(System.in);
    WeaponList weaponList = new WeaponList();
    ArmorList armorList = new ArmorList();

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

    public ArrayList<Weapon> getWeapons(Player player)
    {
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(player.getWep());
        for (Item item : backpack)
        {
            if (item instanceof Weapon)
            {
                weapons.add((Weapon) item);
            }
        }
        return weapons;
    }

    public ArrayList<Armor> getArmors(Player player)
    {
        ArrayList<Armor> armors = new ArrayList<Armor>();
        armors.add(player.getArmor());
        for (Item item : backpack)
        {
            if (item instanceof Armor)
            {
                armors.add((Armor) item);
            }
        }
        return armors;
    }

    public ArrayList<Spell> getSpells()
    {
        ArrayList<Spell> spells = new ArrayList<Spell>();
        for (Item item : backpack)
        {
            if (item instanceof Spell)
            {
                spells.add((Spell) item);
            }
        }
        return spells;
    }

    public ArrayList<MiscItem> getMiscItems()
    {
        ArrayList<MiscItem> misc = new ArrayList<MiscItem>();
        for (Item item: backpack)
        {
            if (item instanceof MiscItem)
            {
                misc.add((MiscItem) item);
            }
        }
        return misc;
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
                accessArmors(player);
            }
            else if (option == 3)
            {
                accessSpells(player);
            }
            else if (option == 4)
            {
                accessMiscItems(player);
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
        weapons = getWeapons(player);
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
        System.out.println("Value: " + weapon.getValue() + " gold");
        System.out.println("Armor Penetration: " + weapon.getAP());
        System.out.println("Stat Requirements: " + weapon.getStrReq() + " strength, " + weapon.getDexReq() + " dexterity");
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
                if(player.getStr() < weapon.getStrReq() && player.getDex() < weapon.getDexReq())
                {
                    System.out.println("You equip your " + weapon.getName()
                        + " but lack the strength and dexterity to wield it effectively.");
                }
                else if (player.getStr() < weapon.getStrReq())
                {
                    System.out.println("You equip your " + weapon.getName()
                        + " but lack the strength to wield it effectively.");
                }
                else if (player.getDex() < weapon.getDexReq())
                {
                    System.out.println("You equip your " + weapon.getName()
                        + " but lack the dexterity to wield it effectively.");
                }
                else
                {
                    System.out.println("You equip your " + weapon.getName()); 
                }
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

    public void accessArmors(Player player)
    {
        ArrayList<Armor> armors = new ArrayList<Armor>();
        armors = getArmors(player);
        System.out.println("ARMORS");
        int endNum = 1;
        for(int i = 0; i < armors.size(); i++)
        {
            System.out.println("" + (i+1) + ". " + armors.get(i).getName());
            endNum++;
        }
        System.out.println("" + endNum + ". Back");
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            if(option > armors.size()+1 && option < 1)
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
                showArmors(armors, option, player);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessArmors(player);
        }
    }

    public void showArmors(ArrayList<Armor> list, int index, Player player)
    {
        Armor armor = list.get(index);
        System.out.println(armor.getName());
        System.out.println(armor.getDesc());
        System.out.println("Armor Value: " + armor.getArmorValue());
        System.out.println("Value: " + armor.getValue() + " gold.");
        System.out.println("1. Equip");
        System.out.println("2. Back");

        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            if (option == 1)
            {
                if(player.getStr() >= armor.getStrReq())
                {
                    Armor oldArmor = player.getArmor();
                    addItem(oldArmor);
                    player.setArmor(armorList.getItem(armor.getID()));
                    removeItem(armor);
                    System.out.println("You equip your " + armor.getName()); 
                }
                else
                {
                    System.out.println("You need " + (armor.getStrReq()-player.getStr()) + " more strength to equip that.");
                    this.accessArmors(player);
                }
            }
            else
            {
                this.accessArmors(player);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessArmors(player);
        }
    }

    public void accessSpells(Player player)
    {
        ArrayList<Spell> spells = new ArrayList<Spell>();
        spells = getSpells();
        System.out.println("SPELLS");
        int endNum = 1;
        if(spells.size() > 1)
        {
            for(int i = 0; i < spells.size(); i++)
            {
                System.out.println("" + (i+1) + ". " + spells.get(i).getName());
                endNum++;
            }
        }
        else
        {
            System.out.println("Your spellbook is empty.");
        }
        System.out.println("" + endNum + ". Back");
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            if(option > spells.size()+1 && option < 1)
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
                showSpell(spells, option, player);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessSpells(player);
        }
    }

    //method for accessing player spells in combat
    public Spell getPlayerSpells(Player player, Enemy enemy)
    {
        ArrayList<Spell> spells = new ArrayList<Spell>();
        spells = getSpells();
        System.out.println("SPELLS");
        int endNum = 1;
        for(int i = 0; i < spells.size(); i++)
        {
            System.out.println("" + (i+1) + ". " + spells.get(i).getName());
            endNum++;
        }
        System.out.println("" + endNum + ". Back");
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            if(option > spells.size()+1 && option < 1)
            {
                throw new NumberFormatException();
            }
            if(option == endNum)
            {
                player.playerTurn(enemy);
                return null;
            }
            else
            {
                option--;
                return spells.get(option);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.getPlayerSpells(player, enemy);
        }
        return null;
    }

    public void showSpell(ArrayList<Spell> list, int index, Player player)
    {
        Spell spell = list.get(index);
        System.out.println(spell.getName());
        System.out.println(spell.getDesc());
        System.out.println("Value: " + spell.getValue() + " gold.");
        System.out.println("Cost: " + spell.getManaCost() + " mana.");
        System.out.println("Requirement: " + spell.getKnowReq() + " knowledge.");
        System.out.println("1. Back");

        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            this.accessSpells(player);
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessSpells(player);
        }
    }

    public void accessMiscItems(Player player)
    {
        ArrayList<MiscItem> misc = new ArrayList<MiscItem>();
        misc = getMiscItems();
        System.out.println("ITEMS");
        int endNum = 1;
        if(misc.size() > 0)
        {
            for(int i = 0; i < misc.size(); i++)
            {
                System.out.println("" + (i+1) + ". " + misc.get(i).getName());
                endNum++;
            }
        }
        else
        {
            System.out.println("Your item pouch is empty.");
        }
        System.out.println("" + endNum + ". Back");
        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);
            if(option > misc.size()+1 && option < 1)
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
                showMiscItem(misc, option, player);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessMiscItems(player);
        }
    }

    public void showMiscItem(ArrayList<MiscItem> list, int index, Player player)
    {
        MiscItem misc = list.get(index);
        System.out.println(misc.getName());
        System.out.println(misc.getDesc());
        System.out.println("1. Back");

        try
        {
            String input = scanner.nextLine();
            int option = Integer.parseInt(input);

            this.accessMiscItems(player);
        }
        catch (NumberFormatException e)
        {
            System.out.println("INVALID INPUT");
            this.accessMiscItems(player);
        }
    }
}

