import Rooms.Enemy;
import Rooms.EnemyRoom;
import Rooms.Room;
import Rooms.TreasureRoom;
import game.Game;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoomTest {

    EnemyRoom enemyRoom;
    TreasureRoom treasureRoom;
    ArrayList<EnemyRoom> enemyRooms;
    ArrayList<TreasureRoom> treasureRooms;
    Game game;
    Enemy enemy;
    Room rooms;

    @Before
    public void setUp() throws Exception {

        enemy = new Enemy("Ogre", 10, 2);

        enemyRoom = new EnemyRoom();
        enemyRoom.addEnemy(enemy);
        treasureRoom = new TreasureRoom(20);
        rooms = new Room();

    }


    @Test
    public void canGetNumberOfRoomsInRooms() {
        assertEquals(0, rooms.getNumberOfRooms());
    }

    @Test
    public void canAddRoom() {
        rooms.addEnemyRoom(enemyRoom);
        rooms.addTreasureRoom(treasureRoom);
        assertEquals(2, rooms.getNumberOfRooms());
    }
}
