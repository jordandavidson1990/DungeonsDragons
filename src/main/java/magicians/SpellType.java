package magicians;

public enum SpellType {
    
    FIREBLAST(10),
    LIGHTINGSTRIKE(15),
    MAGEARROW(20);
    
    private final int attackValue;

    SpellType(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
