import java.util.HashMap;
public class MiscItemList
{
    private HashMap<Integer, MiscItem> miscItemList = new HashMap<Integer, MiscItem>();
    
    MiscItemList()
    {
        MiscItem necklace = new MiscItem();
        necklace.setName("NECKLACE");
        necklace.setDesc("This is a necklace.");
        necklace.setValue(100);
        necklace.setID(301);
    }
    
    public MiscItem getItem(int ID)
    {
        return miscItemList.get(ID);
    }
}
