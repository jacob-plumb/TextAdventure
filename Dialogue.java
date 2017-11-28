public class Dialogue
{
    private String initStatement;
    
    private String[] response;
    private Dialogue[] contra;
    
    private int id;
    //Dialgues objects could have dialogue objects inside of them
    //Each response leads to another connected dialogue, similar to 
    
    //import NPC list, public initDialogue(NPC.getDialogue)
    
    public Dialogue(int numOfResponses)
    {
        response = new String[numOfResponses];
        contra = new Dialogue[numOfResponses];
    }
    
    public String[] getResponseArray()
    {
        return response;
    }
    
    public Dialogue[] getContraArray()
    {
        return contra;
    }
    
    public String getInitStatement()
    {
        return initStatement;
    }
    
    public void setInitStatement(String initStatement)
    {
        this.initStatement = initStatement;
    }
    
    public String getResponse(int index)
    {
        return response[index];
    }
    
    public void setResponse(int index, String response)
    {
        this.response[index] = response;
    }
    
    public Dialogue getContra(int index)
    {
        return contra[index];
    }
    
    public void setContra(int index, Dialogue contra)
    {
        this.contra[index] = contra;
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
