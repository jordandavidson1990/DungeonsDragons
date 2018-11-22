package game;

import Behaviours.Damageable;
import Behaviours.Healable;
import Rooms.EnemyRoom;
import Rooms.Room;
import Rooms.TreasureRoom;

public class Player implements Damageable, Healable {

    private int healthValue;
    private int wallet;
    private Room location;

    public Player(int healthValue, int wallet) {
        this.healthValue = healthValue;
        this.wallet = wallet;
        this.location = null;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

        public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

//    public void attack(Damageable damageable){
//        damageable.takeDamage(this.attackValue);
//    }
//
    public void canBeHealed(int potionValue){
        this.healthValue += potionValue;
    }

    public void collectTreasure(TreasureRoom treasureRoom) {
        this.wallet += treasureRoom.getTreasureValue();
        treasureRoom.emptyTreasure();
    }

    public void enterRoomTreasureRoom(TreasureRoom treasureRoom) {
        this.collectTreasure(treasureRoom);
    }

    public void enterEnemyRoom(EnemyRoom enemyRoom) {
        this.location = enemyRoom;
    }

    public Room getLocation() {
        return this.location;
    }
}
