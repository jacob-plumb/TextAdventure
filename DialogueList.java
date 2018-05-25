import java.util.HashMap;
public class DialogueList
{
    private HashMap<Integer, Dialogue> dialogueList = new HashMap<Integer, Dialogue>();
    
    DialogueList()
    {
        /*
         * Dialogue: 40XY
         */
        
        Dialogue testInit = new Dialogue(3);
        testInit.setInitStatement("'Welcome to the church, my child. As I can see, you are a devout\n"+
                                    "servant of our Lord, the Sun. His light is yours -- I pray you\n"+
                                    "ask if there's any services you require.'");
        testInit.setResponse(0, "'Father, pray tell me of this town's goings-on.'");
        testInit.setResponse(1, "'Tell me about yourself, Father.'");
        testInit.setResponse(2, "'No thank you, Father. Farewell.' [Exit]");
        testInit.setID(4001);
        dialogueList.put(testInit.getID(), testInit);
        
        Dialogue testContra1 = new Dialogue(1);
        testContra1.setInitStatement("'An outsider, eh? Welcome to our little hamlet. The past few\n"+
                                    "months have been challenging, what with the Troubles brewing in\n"+
                                    "the East, but by his Light we shall prevail. We have had some\n"+
                                    "problems with Dark creatures prowling in the night, mostly from\n"+
                                    "those heretics who have strayed too far from his Light.'");
        testContra1.setResponse(0, "'Truly a shame that is, Father. His Light will guide us to victory.' [Exit]");
        
        Dialogue testContra2 = new Dialogue(1);
        testContra2.setInitStatement("'There is not much to be said for myself. I am a man of the Sun,\n"+
                                    "and any part of my life before my clerical oath is not worthy of\n"+
                                    "discussing within his hallowed halls. Perhaps another day, child.'");
        testContra2.setResponse(0, "'I see, Father. Farewell.' [Exit]");
        
        Dialogue testContra3 = new Dialogue(0);
        testContra3.setInitStatement("'Farewell, my child. May his Light illuminate your path.'");
        
        testInit.setContra(0, testContra1);
        testInit.setContra(1, testContra2);
        testInit.setContra(2, testContra3);
        
    }
    
    public Dialogue getDialogue(int ID)
    {
        return dialogueList.get(ID);
    }
}
