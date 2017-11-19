import java.util.HashMap;
public class DialogueList
{
    private HashMap<Integer, Dialogue> dialogueList = new HashMap<Integer, Dialogue>();
    
    DialogueList()
    {
        Dialogue testInit = new Dialogue();
        testInit.setResponses(3);
        testInit.setInitStatement("'Test initial statement'");
        testInit.setResp1("'First player response'");
        testInit.setResp2("'Second player response'");
        testInit.setResp3("'Third player response'");
        testInit.setResp4("'Fourth player response' [Exit]");
        testInit.setID(1001);
        dialogueList.put(testInit.getID(), testInit);
        
        Dialogue testResp1 = new Dialogue();
        testResp1.setResponses(1);
        testResp1.setInitStatement("Test statement responding to player choice 1.");
        testResp1.setResp1("Goodbye! [Exit]");
        testResp1.setID(1002);
        dialogueList.put(testResp1.getID(), testResp1);
        
        Dialogue testResp2 = new Dialogue();
        testResp2.setResponses(1);
        testResp2.setInitStatement("Test statement responding to player choice 2.");
        testResp2.setResp1("Farewell! [Exit]");
        testResp2.setID(1003);
        dialogueList.put(testResp2.getID(), testResp2);
        
        Dialogue testResp3 = new Dialogue();
        testResp3.setResponses(1);
        testResp3.setInitStatement("Test statement responding to player choice 3.");
        testResp3.setResp1("Bye! [Exit]");
        testResp3.setID(1004);
        dialogueList.put(testResp3.getID(), testResp3);
        
        //SETTING CONTRAS
        testInit.setContra1(testResp1);
        testInit.setContra2(testResp2);
        testInit.setContra3(testResp3);
    }
    
    public Dialogue getDialogue(int ID)
    {
        return dialogueList.get(ID);
    }
}
