package Rooms;

import java.util.ArrayList;

public class Room {

    private ArrayList<TreasureRoom> treasureRooms;
    private ArrayList<EnemyRoom> enemyRooms;

    public Room() {
        this.treasureRooms = new ArrayList<TreasureRoom>();
        this.enemyRooms = new ArrayList<EnemyRoom>();
    }


    public int getNumberOfRooms() {
        int totalRooms = this.treasureRooms.size()+ this.enemyRooms.size();
        return totalRooms;
    }

    public ArrayList<TreasureRoom> getTreasureRooms() {
        return treasureRooms;
    }

    public ArrayList<EnemyRoom> getEnemyRooms() {
        return enemyRooms;
    }

    public void addEnemyRoom(EnemyRoom enemyRoom) {
        this.enemyRooms.add(enemyRoom);
    }

    public void addTreasureRoom(TreasureRoom treasureRoom){
        this.treasureRooms.add(treasureRoom);
    }
}
