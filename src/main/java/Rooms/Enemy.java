package Rooms;

import Behaviours.Attackable;
import Behaviours.Damageable;

public class Enemy implements Damageable, Attackable {

    private String type;
    private int healthValue;
    private int attackValue;

    public Enemy(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public void attack(Damageable damageable){
        damageable.takeDamage(this.attackValue);
    }

}
