import java.util.HashMap;
public class ArmorList
{
    private HashMap<Integer, Armor> armorList = new HashMap<Integer, Armor>();

    ArmorList()
    {
       Armor gambeson = new Armor();
       gambeson.setName("GAMBESON");
       gambeson.setDesc("This is a gambeson.");
       gambeson.setID(201);
       gambeson.setValue(10);
       gambeson.setArmorValue(15);
       armorList.put(gambeson.getID(), gambeson);
       
       Armor clothes = new Armor();
       clothes.setName("CLOTHES");
       clothes.setDesc("These are normal clothes.");
       clothes.setID(202);
       clothes.setValue(1);
       clothes.setArmorValue(5);
       armorList.put(clothes.getID(), clothes);
    }
    
    public Armor getItem(int ID)
    {
        return armorList.get(ID);
    }
}
