import java.util.HashMap;
public class NPCList
{
    private HashMap<Integer, NPC> npcList = new HashMap<Integer, NPC>();
    
    DialogueList dialogueList = new DialogueList();
    
    NPCList()
    {
        NPC testNPC = new NPC();
        testNPC.setName("TEST NPC");
        testNPC.setDialogue(dialogueList.getDialogue(1001));
        testNPC.setID(101);
        npcList.put(testNPC.getID(), testNPC);
    }
    
    public NPC getNPC(int ID)
    {
        return npcList.get(ID);
    }
}
