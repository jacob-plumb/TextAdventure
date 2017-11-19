import java.util.Scanner;
public class NPC extends Character
{
    DialogueList dialogueList = new DialogueList();
    
    Scanner scanner = new Scanner(System.in);
    
    private int id;
    
    private Dialogue dialogue;
    
    public int getID()
    {
        return id;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    
    public Dialogue getDialogue()
    {
        return dialogue;
    }
    
    public void setDialogue(Dialogue dialogue)
    {
        this.dialogue = dialogue;
    }
}
