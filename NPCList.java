import java.util.HashMap;
public class NPCList
{
    private HashMap<Integer, NPC> npcList = new HashMap<Integer, NPC>();
    
    DialogueList dialogueList = new DialogueList();
    
    NPCList()
    {
        /*
         * NPC: 45XY
         */
        
        NPC testNPC = new NPC();
        testNPC.setName("Father Donovan");
        testNPC.setDialogue(dialogueList.getDialogue(4001));
        testNPC.setID(4501);
        npcList.put(testNPC.getID(), testNPC);
    }
    
    public NPC getNPC(int ID)
    {
        return npcList.get(ID);
    }
}
