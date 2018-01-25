import java.util.HashMap;
public class EnemyList
{
    private HashMap<Integer, Enemy> enemyList = new HashMap<Integer, Enemy>();
    
    WeaponList weaponList = new WeaponList();
    ArmorList armorList = new ArmorList();
    
    EnemyList()
    {
       //BANDIT
       Enemy bandit = new Enemy();
       bandit.setName("BANDIT");
       bandit.setStr(5);
       bandit.setDex(5);
       bandit.setCon(5);
       bandit.setKnow(5);
       bandit.setWis(5);
       bandit.setCha(5);
       bandit.setWep(weaponList.getItem(102));
       bandit.setArmor(armorList.getItem(202));
       bandit.setLevel(1);
       bandit.setGold(5);
       bandit.setXP(25);
       bandit.setMaxHP(bandit.getCon() * 5);
       bandit.setMaxMP(bandit.getKnow() * 5);
       bandit.setTempHP(bandit.getMaxHP());
       bandit.setTempMP(bandit.getMaxMP());
       bandit.setID(101);
       enemyList.put(bandit.getID(), bandit);
       
       //OTHER ENEMIES
    }
    
    public Enemy getEnemy(int ID)
    {
        return enemyList.get(ID);
    }
}
