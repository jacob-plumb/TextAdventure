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
        
        Dialogue testContra1 = new Dialogue(1);
        testContra1.setInitStatement("Test contra to response 1");
        testContra1.setResponse(0, "Test player response 1 [Exit]");
        
        Dialogue testContra2 = new Dialogue(1);
        testContra2.setInitStatement("Test contra to response 2");
        testContra2.setResponse(0, "Test player response 1 [Exit]");
        
        Dialogue testContra3 = new Dialogue(0);
        testContra3.setInitStatement("Test contra to response 3");
        
    }
    
    public Dialogue getDialogue(int ID)
    {
        return dialogueList.get(ID);
    }
}
