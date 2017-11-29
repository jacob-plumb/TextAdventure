public class Dialogue
{
    private String initStatement;
    private String exitStatement = "Goodbye!";
    
    private String[] response;
    private Dialogue[] contra;
    
    private int id;
    
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
    
    public String getExitStatement()
    {
        return exitStatement;
    }
    
    public void setExitStatement(String exitStatement)
    {
        this.exitStatement = exitStatement;
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
