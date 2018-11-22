package clerics;

public class Potion {

    private PotionType potionType;

    public Potion(PotionType potionType) {
        this.potionType = potionType;
    }

    public PotionType getPotionType() {
        return potionType;
    }
}
