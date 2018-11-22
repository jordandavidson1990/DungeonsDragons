import Rooms.Enemy;
import Rooms.EnemyRoom;
import Rooms.Room;
import Rooms.TreasureRoom;
import clerics.Cleric;
import clerics.Potion;
import clerics.PotionType;
import fighters.Armour;
import fighters.Barbarian;
import game.Game;
import game.Player;
import magicians.Creature;
import magicians.Warlock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Player player3;
    TreasureRoom treasureRoom1;
    TreasureRoom treasureRoom2;
    EnemyRoom enemyRoom1;
    EnemyRoom enemyRoom2;
    ArrayList<EnemyRoom>enemyRooms;
    ArrayList<TreasureRoom>treasureRooms;
//    Room room;
    Enemy enemy;
    Room room;
    Barbarian barbarian;
    Cleric cleric;
    Enemy enemy2;
    Enemy enemy3;
    Warlock warlock;
    Creature creature;
    Armour armour;
    Potion potion;


    @Before
    public void setUp() throws Exception {
        treasureRoom1 = new TreasureRoom(10);
        treasureRoom2 = new TreasureRoom(5);

        enemy = new Enemy("Ogre", 50, 20);
        enemy2 = new Enemy("Troll", 80, 5);
        enemy3 = new Enemy("Warg",4, 20);

        enemyRoom1 = new EnemyRoom();
        enemyRoom2 = new EnemyRoom();
        enemyRoom1.addEnemy(enemy);
        enemyRoom2.addEnemy(enemy2);

        game = new Game(treasureRooms, enemyRooms);
        player1 = new Player(30, 20);
        player2 = new Player(20, 5);
        player3 = new Player(30, 0);
        creature = new Creature("Elephant", 20, 50);
        game.addPlayer(player1);
        game.addPlayer(player2);
        room = new Room();
        barbarian = new Barbarian(50, 10, 0, "Sword");
        warlock = new Warlock(80, 50, creature, "Dumbledore", 0);

        cleric = new Cleric(30);
        potion = new Potion(PotionType.TONIC);
        armour = new Armour(50);
    }

    @Test
    public void canGetPlayerCount() {
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void canAddPlayers() {
        game.addPlayer(player3);
        assertEquals(3, game.getPlayerCount());
    }

//    @Test
//    public void playerCanEnterTreasureRoom() {
//        player1.enterRoomTreasureRoom(treasureRoom1); // player starts with 20 gold. Treasure Room has 10
//        assertEquals(30, player1.getWallet());
//    }

    @Test
    public void playerCanEnterEnemyRoom() {
        cleric.enterEnemyRoomAsPassive(enemyRoom1);
        assertEquals(10, cleric.getHealthValue());
    }

    @Test
    public void barbarianCanEnterEnemyRoomDamageEnemyAndBeDamaged() {
        barbarian.enterEnemyRoomAsAggressive(enemyRoom1);
        assertEquals(30, barbarian.getHealthValue());
        assertEquals(40, enemy.getHealthValue());
    }

    @Test
    public void canCompleteQuestOfClearingTwoRooms() {  // barbarian starts as 50 health and 10 attack.
        barbarian.equipArmour(armour); // health gets raised to 100
        barbarian.enterEnemyRoomAsAggressive(enemyRoom1); // barb get lowered to 80, ogre to 40
        warlock.enterEnemyRoomAsAggressiveMagician(enemyRoom1); // warlock health at 60, ogre eliminated
        assertEquals(null, enemyRoom1.getEnemy());
        assertEquals(60, warlock.getHealthValue());
        assertEquals(50, warlock.getCreature().getHealthValue());
        assertEquals(80, barbarian.getHealthValue());
        warlock.enterEnemyRoomAsAggressiveMagician(enemyRoom2);// warlock health at 55, creature health 50. Troll Starts 80. Warlock attacks with 50, creature with 20. Troll attacks with 5.
        assertEquals(55, warlock.getHealthValue());
        assertEquals(50, creature.getHealthValue());
        assertEquals(10, enemy2.getHealthValue());
        cleric.addPotionToPotions(potion); // tonic has healthing of 7
        cleric.heal(warlock, potion);
        assertEquals(62, warlock.getHealthValue());
        warlock.attack(enemy2);
        assertEquals("deceased", enemyRoom2.getEnemy().getStatus());

    }
}
