import magicians.Creature;
import magicians.Spell;
import magicians.SpellType;
import magicians.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Creature dragon;
    Spell spell;
    Spell spell2;

    @Before
    public void setUp() throws Exception {
        spell = new Spell(SpellType.FIREBLAST);
        spell2 = new Spell(SpellType.LIGHTINGSTRIKE);
        dragon = new Creature("Dragon", 10, 20);
        warlock = new Warlock(10, 20, dragon, "Gandalf", 0);
    }

    @Test
    public void hasACreature() {
        assertEquals("Dragon", warlock.getCreature().getType());
    }

    @Test
    public void canAddSpell() {
        warlock.addSpell(spell);
        warlock.addSpell(spell2);
        assertEquals(2, warlock.spellCount());
    }
}
