import Rooms.Enemy;
import Rooms.EnemyRoom;
import Rooms.Room;
import Rooms.TreasureRoom;
import game.Game;
import game.Player;
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


    @Before
    public void setUp() throws Exception {
        treasureRoom1 = new TreasureRoom(10);
        treasureRoom2 = new TreasureRoom(5);
        enemy = new Enemy("Ogre", 50, 20);
        enemyRoom1 = new EnemyRoom(enemy);
        game = new Game(treasureRooms, enemyRooms);
        player1 = new Player(30, 20);
        player2 = new Player(20, 5);
        player3 = new Player(30, 0);
        game.addPlayer(player1);
        game.addPlayer(player2);
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

    @Test
    public void playerCanEnterTreasureRoom() {
        player1.enterRoomTreasureRoom(treasureRoom1); // player starts with 20 gold. Treasure Room has 10
        assertEquals(30, player1.getWallet());
    }

    @Test
    public void playerCanEnterEnemyRoom() {
        player1.enterEnemyRoom(enemyRoom1);
        assertEquals(enemyRoom1, player1.getLocation());
    }
}
