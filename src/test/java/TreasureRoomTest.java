import Rooms.TreasureRoom;
import magicians.Creature;
import magicians.Spell;
import magicians.SpellType;
import magicians.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Warlock warlock;
    Creature creature;

    @Before
    public void setUp() throws Exception {
        treasureRoom = new TreasureRoom(10);
        creature = new Creature("Horse", 10, 10);
        warlock = new Warlock(10, 10, creature, "Gandalf", 0);
    }

    @Test
    public void canCollectTreasure() {
        warlock.collectTreasure(treasureRoom);
        assertEquals(10, warlock.getWallet());
        assertEquals(0, treasureRoom.getTreasureValue());
    }
}
