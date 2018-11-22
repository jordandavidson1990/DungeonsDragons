package clerics;

import Behaviours.Damageable;
import Behaviours.Healable;
import Behaviours.Healingable;
import Behaviours.Playerables;

import java.util.ArrayList;

public class Cleric implements Damageable, Healingable {

    private int healthValue;
    private ArrayList<Potion> potions;

    public Cleric(int healthValue) {
        this.healthValue = healthValue;
        this.potions = new ArrayList<Potion>();
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void addPotionToPotions(Potion potion){
        this.potions.add(potion);
    }

    public int getPotionCount() {
        return this.potions.size();
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public void heal(Healable healable, Potion potion){
        int potionValue = potion.getPotionType().getHealingValue();
        healable.canBeHealed(potionValue);
    }
}
