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
        
        Dialogue test_resp1 = new Dialogue();
        test_resp1.setResponses(1);
        test_resp1.setInitStatement("Test statement responding to player choice 1.");
        test_resp1.setResp1("Goodbye! [Exit]");
        
        Dialogue test_resp2 = new Dialogue();
        test_resp2.setResponses(1);
        test_resp2.setInitStatement("Test statement responding to player choice 2.");
        test_resp2.setResp1("Farewell! [Exit]");
        
        Dialogue test_resp3 = new Dialogue();
        test_resp3.setResponses(1);
        test_resp3.setInitStatement("Test statement responding to player choice 3.");
        test_resp3.setResp1("Bye! [Exit]");
        
        //SETTING CONTRAS
        test_init.setContra1(test_resp1);
        test_init.setContra2(test_resp2);
        test_init.setContra3(test_resp3);
    }
    
    public Dialogue getDialogue(int ID)
    {
        return dialogueList.get(ID);
    }
}
