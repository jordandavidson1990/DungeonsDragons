package magicians;

import Behaviours.Attackable;
import Behaviours.Damageable;
import Behaviours.Healable;
import Behaviours.Playerables;
import Rooms.EnemyRoom;
import Rooms.TreasureRoom;
import game.Player;

import java.util.ArrayList;

public abstract class Magician extends Player implements Damageable, Attackable, Healable {

    private int healthValue;
    private int attackValue;
    private Creature creature;
    private String name;
    private ArrayList<SpellType> spells;
    private int wallet;

    public Magician(int healthValue, int attackValue, Creature creature, String name, int wallet) {
        super(healthValue, wallet);

//        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.creature = creature;
        this.name = name;
        this.spells = new ArrayList<SpellType>();
//        this.wallet = 0;
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

    public void addSpell(Spell spell) {
        this.spells.add(spell.getSpellType());
    }

//    public void takeDamage(int damage) {
//        this.healthValue -= damage;
//    }

    public void attack(Damageable damageable) {
        damageable.takeDamage(this.attackValue);
    }

    public void enterEnemyRoomAsAggressiveMagician(EnemyRoom enemyRoom) {
        this.attack(enemyRoom.getEnemy());
        this.takeDamage(enemyRoom.getEnemy().getAttackValue());
        this.creature.attack(enemyRoom.getEnemy());
        if (enemyRoom.getEnemy().getHealthValue() <= 0) {
            enemyRoom.setEnemy(null);
        }
    }
}
