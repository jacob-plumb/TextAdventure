import java.util.HashMap;
public class DialogueList
{
    private HashMap<Integer, Dialogue> dialogueList = new HashMap<Integer, Dialogue>();
    
    DialogueList()
    {
        Dialogue testInit = new Dialogue(3);
        testInit.setInitStatement("Test init statement");
        testInit.setResponse(0, "Test player response 1");
        testInit.setResponse(1, "Test player response 2");
        testInit.setResponse(2, "Test player response 3 [Exit]");
        
    }
    
    public Dialogue getDialogue(int ID)
    {
        return dialogueList.get(ID);
    }
}
