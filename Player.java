import java.util.Scanner;
import java.lang.Math;
public class Player extends Character
{
    private Room currentRoom;
    
    Scanner scanner = new Scanner(System.in);
    
    public Player(Room currentRoom)
    {
        this.currentRoom = currentRoom;
    }
    
    public String getRoomName()
    {
        return currentRoom.getName();
    }
    
    public String getRoomDesc()
    {
        return currentRoom.getDesc();
    }
    
    public Room getRoom()
    {
        return currentRoom;
    }
    
    public void printStats(){
        System.out.println("PLAYER STATS");
        super.printStats();
    }
    
    public void playerMove(Player player, Room newRoom)
    {
        if(newRoom != null)
        {
            if (newRoom.getEnemy() != null)
            {
                if (playerCombat(player, newRoom.getEnemy()))
                {
                    newRoom.setEnemy(null);
                    currentRoom = newRoom;
                }
            }
            else
            {
                currentRoom = newRoom;
            }
        }
    }
    
    public boolean playerCombat(Player player, Enemy enemy)
    {
        while (player.getTempHP() > 0 && enemy.getTempHP() > 0)
        {
            System.out.println();
            System.out.println("You are facing a " + enemy.getName());
            player.printCombatStats();
            enemy.printCombatStats();
            player.playerTurn(player, enemy);
            if (enemy.getTempHP() > 0)
            {
                enemy.attack(enemy, player);
            }
        }
        if (player.getTempHP() <= 0)
        {
            System.out.println("" + player.getName() + " loses!");
            player.setGold(0);
            player.setTempHP(player.getMaxHP() / 2);
            return false;
        }
        else
        {
            System.out.println("" + player.getName() + " wins, gaining " + enemy.getXP() 
            + " XP and " + enemy.getGold() + " gold!");
            player.setXP(player.getXP() + enemy.getXP());
            player.setGold(player.getGold() + enemy.getGold());
            return true;
        }
    }
    
    public void playerTurn(Player player, Enemy enemy)
    {
        System.out.println("1. Attack");
        System.out.println("2. Die");
        int option = scanner.nextInt();
        if (option == 1)
        {
            player.attack(player, enemy);
        }
        else
        {
            player.setTempHP(0);
        }
    }
}
