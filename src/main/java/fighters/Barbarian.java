package fighters;

public class Barbarian extends Fighter {

    private String weapon;

    public Barbarian(int healthValue, int attackValue, String weapon) {
        super(healthValue, attackValue);
        this.weapon = weapon;
    }


}
