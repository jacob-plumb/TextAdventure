import java.util.HashMap;
public class EnemyList
{
    private HashMap<Integer, Enemy> enemyList = new HashMap<Integer, Enemy>();
    
    WeaponList weaponList = new WeaponList();
    ArmorList armorList = new ArmorList();
    SpellList spellList = new SpellList();
    MiscItemList miscItemList = new MiscItemList();
    
    //STR, DEX, CON, KNOW, WIS, CHA
    EnemyList()
    {
       /*
        * ENEMIES:  5XYZ
        */
       
       //BANDIT
       Enemy bandit = new Enemy();
       bandit.setName("BANDIT");
       bandit.setAtt(3, 4, 4, 2, 1, 3);
       bandit.setWep(weaponList.getItem(1021));
       bandit.setArmor(armorList.getItem(1511));
       bandit.setLevel(1);
       bandit.setGold(1, 6);
       bandit.setXP(25);
       bandit.calcMaxHP();
       bandit.setMaxMP(bandit.getKnow() * 3);
       bandit.setTempHP(bandit.getMaxHP());
       bandit.setTempMP(bandit.getMaxMP());
       bandit.setID(5001);
       enemyList.put(bandit.getID(), bandit);
       
       //CULTIST
       Enemy cultist = new Enemy();
       cultist.setName("CULTIST");
       cultist.setAtt(2, 4, 2, 5, 3, 2);
       cultist.setWep(weaponList.getItem(1011));
       cultist.setArmor(armorList.getItem(1513));
       cultist.setLevel(1);
       cultist.setGold(4, 10);
       cultist.setXP(35);
       cultist.calcMaxHP();
       cultist.setMaxMP(cultist.getKnow() * 3);
       cultist.setTempHP(cultist.getMaxHP());
       cultist.setTempMP(cultist.getMaxMP());
       cultist.setID(5002);
       cultist.addSpell(spellList.getSpell(2101));
       cultist.addSpell(spellList.getSpell(2201));
       enemyList.put(cultist.getID(), cultist);
       
       //BELLIGERENT DRUNK
       Enemy drunk = new Enemy();
       drunk.setName("BELLIGERENT DRUNK");
       drunk.setAtt(5, 2, 5, 1, 2, 4);
       drunk.setWep(weaponList.getItem(1021));
       drunk.setArmor(armorList.getItem(1512));
       drunk.setLevel(1);
       drunk.setGold(4, 10);
       drunk.setXP(35);
       drunk.calcMaxHP();
       drunk.setMaxMP(drunk.getKnow() * 3);
       drunk.setTempHP(drunk.getMaxHP());
       drunk.setTempMP(drunk.getMaxMP());
       drunk.setID(5003);
       enemyList.put(drunk.getID(), drunk);
    }
    
    public Enemy getEnemy(int ID)
    {
        return enemyList.get(ID);
    }
}
