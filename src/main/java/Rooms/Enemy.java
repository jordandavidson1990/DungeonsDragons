package Rooms;

import Behaviours.Attackable;
import Behaviours.Damageable;

public class Enemy implements Damageable, Attackable {

    private String type;
    private int healthValue;
    private int attackValue;
    private String status;

    public Enemy(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.status = "alive";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if(this.healthValue<=0){
            this.status = "deceased";
        }
    }

    public void attack(Damageable damageable){
        damageable.takeDamage(this.attackValue);
    }

}
