
import Rooms.Enemy;
import clerics.Cleric;
import clerics.Potion;
import clerics.PotionType;
import fighters.Barbarian;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BarbarianTest {

    Barbarian barbarian;
    ArrayList<String> weapons;
    Enemy enemy;
    Cleric cleric;
    Potion potion;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric(20);
        potion = new Potion(PotionType.TONIC);
        cleric.addPotionToPotions(potion);
        enemy = new Enemy("Goblin", 15, 5);
        weapons = new ArrayList<String>();
        barbarian = new Barbarian(10, 5, 0,"Sword" );
    }

    @Test
    public void canAddWeaponsToArrayList() {
        weapons.add("Axe");
        weapons.add("Dagger");
        weapons.add("Bow");
        assertEquals(3, weapons.size());
    }

    @Test
    public void canGetHealth() {
        assertEquals(10, barbarian.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(5, barbarian.getAttackValue());
    }

    @Test
    public void canSetHealth() {
        barbarian.setHealthValue(5);
        assertEquals(5, barbarian.getHealthValue());
    }

    @Test
    public void canSetAttackValue() {
        barbarian.setAttackValue(15);
        assertEquals(15, barbarian.getAttackValue());
    }

    @Test
    public void canAttackEnemy() {
        barbarian.attack(enemy);
        assertEquals(10, enemy.getHealthValue());
    }

    @Test
    public void canBeHealed() {
        enemy.attack(barbarian); // should reduce health to 5
        cleric.heal(barbarian, potion); // tonic has value of 7
        assertEquals(12, barbarian.getHealthValue());
    }
}
