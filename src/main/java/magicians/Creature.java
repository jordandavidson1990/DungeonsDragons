package magicians;

public class Creature {

    private String type;
    private int attackValue;
    private int healthValue;

    public Creature(String type, int attackValue, int healthValue) {
        this.type = type;
        this.attackValue = attackValue;
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
