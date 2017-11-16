import java.util.HashMap;
public class DialogueList
{
    private HashMap<Integer, Dialogue> dialogueList = new HashMap<Integer, Dialogue>();
    
    DialogueList()
    {
        Dialogue test_init = new Dialogue();
        test_init.setResponses(3);
        test_init.setInitStatement("Test initial statement");
        test_init.setResp1("First player response");
        test_init.setResp2("Second player response");
        test_init.setResp3("Third player response");
        test_init.setResp4("Fourth player response [exit]");
    }
    
    public Dialogue getDialogue(int ID)
    {
        return dialogueList.get(ID);
    }
}
