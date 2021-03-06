import java.util.HashMap;
public class ArmorList
{
    private HashMap<Integer, Armor> armorList = new HashMap<Integer, Armor>();

    ArmorList()
    {
       /*
        * ARMOR:    15XY
        * Misc:     150Y
        * Textile:  151Y
        * Mail:     152Y
        * Plate:    153Y
        * 
        */
       
       Armor clothes = new Armor();
       clothes.setName("CLOTHES");
       clothes.setDesc("These are normal clothes.");
       clothes.setID(1511);
       clothes.setValue(1);
       clothes.setArmorValue(1);
       clothes.setStrReq(0);
       armorList.put(clothes.getID(), clothes);
       
       Armor gambeson = new Armor();
       gambeson.setName("GAMBESON");
       gambeson.setDesc("This is a gambeson.");
       gambeson.setID(1512);
       gambeson.setValue(15);
       gambeson.setArmorValue(3);
       gambeson.setStrReq(0);
       armorList.put(gambeson.getID(), gambeson);
       
       Armor robes = new Armor();
       robes.setName("ROBES");
       robes.setDesc("These are normal robes.");
       robes.setID(1513);
       robes.setValue(10);
       robes.setArmorValue(2);
       robes.setStrReq(0);
       armorList.put(robes.getID(), robes);
       
       Armor mailShirt = new Armor();
       mailShirt.setName("MAIL SHIRT");
       mailShirt.setDesc("This is a mail shirt.");
       mailShirt.setID(1521);
       mailShirt.setValue(50);
       mailShirt.setArmorValue(5);
       mailShirt.setStrReq(3);
       armorList.put(mailShirt.getID(), mailShirt);
       
       Armor mailHauberk = new Armor();
       mailHauberk.setName("MAIL HAUBERK");
       mailHauberk.setDesc("This is a mail hauberk.");
       mailHauberk.setID(1522);
       mailHauberk.setValue(60);
       mailHauberk.setArmorValue(6);
       mailHauberk.setStrReq(5);
       armorList.put(mailHauberk.getID(), mailHauberk);
       
       Armor halfPlate = new Armor();
       halfPlate.setName("HALF PLATE");
       halfPlate.setDesc("This is the upper half of a suit of armor.");
       halfPlate.setID(1531);
       halfPlate.setValue(100);
       halfPlate.setArmorValue(8);
       halfPlate.setStrReq(6);
       armorList.put(halfPlate.getID(), halfPlate);
       
       Armor fullPlate = new Armor();
       fullPlate.setName("FULL PLATE");
       fullPlate.setDesc("This is a full suit of armor.");
       fullPlate.setID(1532);
       fullPlate.setValue(140);
       fullPlate.setArmorValue(10);
       fullPlate.setStrReq(8);
       armorList.put(fullPlate.getID(), fullPlate);
    }
    
    public Armor getItem(int ID)
    {
        return armorList.get(ID);
    }
}
