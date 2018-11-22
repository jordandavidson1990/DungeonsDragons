package clerics;

public enum PotionType {

    ELDERFLOWER(4),
    TONIC(7),
    EXILIR(10);

    private final int healingValue;

    PotionType(int healingValue) {
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }

}
