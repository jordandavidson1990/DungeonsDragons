package fighters;

public class Barbarian extends Fighter {

    private String weapon;

    public Barbarian(int healthValue, int attackValue, int wallet, String weapon) {
        super(healthValue, attackValue, wallet);
        this.weapon = weapon;
    }


}
