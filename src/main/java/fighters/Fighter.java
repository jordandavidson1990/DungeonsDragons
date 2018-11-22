package fighters;

import Behaviours.Attackable;
import Behaviours.Damageable;
import Behaviours.Healable;
import Behaviours.Playerables;
import game.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player implements Damageable, Attackable, Healable {

//    private int healthValue;
    private int attackValue;
    private ArrayList<String> weapons;

    public Fighter(int healthValue, int attackValue, int wallet) {
        super(healthValue, wallet);
        this.weapons = new ArrayList<String>();
        this.attackValue = attackValue;
    }

//    public int getHealthValue() {
//        return healthValue;
//    }
//
//    public void setHealthValue(int healthValue) {
//        this.healthValue = healthValue;
//    }
//
    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }


//    public void takeDamage(int damage) {
//        this.healthValue -= damage;
//    }
//
    public void attack(Damageable damageable){
        damageable.takeDamage(this.attackValue);
    }
//
//    public void canBeHealed(int potionValue){
//        this.healthValue += potionValue;
//    }


}
