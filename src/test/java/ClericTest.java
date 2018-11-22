import clerics.Cleric;
import clerics.Potion;
import clerics.PotionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric(15);
        potion = new Potion(PotionType.TONIC);
    }

    @Test
    public void canAddPotionToCleric() {
        cleric.addPotionToPotions(potion);
        assertEquals(1, cleric.getPotionCount());
    }

    @Test
    public void getHealthValue() {
        assertEquals(15, cleric.getHealthValue());
    }

    @Test
    public void canHeal() {
        cleric.addPotionToPotions(potion);

    }
}
