import java.util.HashMap;
public class MiscItemList
{
    private HashMap<Integer, MiscItem> miscItemList = new HashMap<Integer, MiscItem>();
    
    MiscItemList()
    {
        /*
         * MISC:        3XYZ
         */
        MiscItem necklace = new MiscItem();
        necklace.setName("NECKLACE");
        necklace.setDesc("This is a necklace.");
        necklace.setValue(3000);
        necklace.setID(301);
        miscItemList.put(necklace.getID(), necklace);
    }
    
    public MiscItem getItem(int ID)
    {
        return miscItemList.get(ID);
    }
}
