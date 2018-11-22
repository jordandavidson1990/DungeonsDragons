package magicians;

import Behaviours.Attackable;
import Behaviours.Damageable;
import Behaviours.Healable;
import Behaviours.Playerables;
import Rooms.TreasureRoom;

import java.util.ArrayList;

public abstract class Magician implements Damageable, Attackable, Healable, Playerables {

    private int healthValue;
    private int attackValue;
    private Creature creature;
    private String name;
    private ArrayList<SpellType>spells;
    private int wallet;

    public Magician(int healthValue, int attackValue, Creature creature, String name, int wallet) {
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.creature = creature;
        this.name = name;
        this.spells = new ArrayList<SpellType>();
        this.wallet = 0;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public int spellCount() {
        return this.spells.size();
    }

    public void addSpell(Spell spell){
        this.spells.add(spell.getSpellType());
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public void attack(Damageable damageable){
        damageable.takeDamage(this.attackValue);
    }

    public void canBeHealed(int potionValue){
        this.healthValue += potionValue;
    }


    public void collectTreasure(TreasureRoom treasureRoom) {
        this.wallet += treasureRoom.getTreasureValue();
        treasureRoom.emptyTreasure();
    }
}
