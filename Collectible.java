public class Collectible extends Item
{
    private int amount;
    
    public int getAmount()
    {
        return amount;
    }
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    public void addAmount(int gathered)
    {
        amount += gathered;
    }
}
