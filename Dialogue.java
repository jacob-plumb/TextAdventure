public class Dialogue
{
    private String initStatement;
    private int responses;
    
    private String resp1;
    private String resp2;
    private String resp3;
    private String resp4;
    
    private Dialogue contra1;
    private Dialogue contra2;
    private Dialogue contra3;
    private Dialogue contra4;
    
    private int id;
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
    
    public Dialogue contra1()
    {
        return contra1;
    }
    
    public void setContra1(Dialogue contra)
    {
        contra1 = contra;
    }
    
    public Dialogue contra2()
    {
        return contra2;
    }
    
    public void setContra2(Dialogue contra)
    {
        contra2 = contra;
    }
    
    public Dialogue contra3()
    {
        return contra3;
    }
    
    public void setContra3(Dialogue contra)
    {
        contra3 = contra;
    }
    
    public Dialogue contra4()
    {
        return contra4;
    }
    
    public void setContra4(Dialogue contra)
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
}
