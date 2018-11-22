import magicians.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature dragon;

    @Before
    public void setUp() throws Exception {
        dragon = new Creature("Dragon", 10, 20);
    }

    @Test
    public void canGetType() {
        assertEquals("Dragon", dragon.getType());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(10, dragon.getAttackValue());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(20, dragon.getHealthValue());
    }

    @Test
    public void canSetHealthValue() {
        dragon.setHealthValue(15);
        assertEquals(15, dragon.getHealthValue());
    }
}
