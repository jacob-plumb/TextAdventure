public class Dialogue
{
    DialogueList dialogueList = new DialogueList();
    
    private String initStatement;
    private int responses;
    
    private String resp1;
    private String resp2;
    private String resp3;
    private String resp4;
    
    private String contra1;
    private String contra2;
    private String contra3;
    private String contra4;
    
    private int id;
    
    private boolean exit;
    //Dialgues objects could have dialogue objects inside of them
    //Each responses leads to another connected dialogue, similar to 
    
    //import NPC list, public initDialogue(NPC.getDialogue)
    
    public String getInitStatement()
    {
        return initStatement;
    }
    
    public void setInitStatement(String initStatement)
    {
        this.initStatement = initStatement;
    }
    
    public int getResponses()
    {
        return responses;
    }
    
    public void setResponses(int responses)
    {
        this.responses = responses;
    }
    
    public String getResp1()
    {
        return resp1;
    }
    
    public void setResp1(String resp)
    {
        resp1= resp;
    }
    
    public String getResp2()
    {
        return resp2;
    }
    
    public void setResp2(String resp)
    {
        resp2 = resp;
    }
    
    public String getResp3()
    {
        return resp3;
    }
    
    public void setResp3(String resp)
    {
        resp3 = resp;
    }
    
    public String getResp4()
    {
        return resp4;
    }
    
    public void setResp4(String resp)
    {
        resp4 = resp;
    }
    
    public String contra1()
    {
        return contra1;
    }
    
    public void setContra1(String contra)
    {
        contra1 = contra;
    }
    
    public String contra2()
    {
        return contra2;
    }
    
    public void setContra2(String contra)
    {
        contra2 = contra;
    }
    
    public String contra3()
    {
        return contra3;
    }
    
    public void setContra3(String contra)
    {
        contra3 = contra;
    }
    
    public String contra4()
    {
        return contra4;
    }
    
    public void setContra4(String contra)
    {
        contra4 = contra;
    }
    
    public int getID()
    {
        return id;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    
    public boolean getExit()
    {
        return exit;
    }
    
    public void setExit(boolean exit)
    {
        this.exit = exit;
    }
}
