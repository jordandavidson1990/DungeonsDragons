package game;

import Behaviours.Playerables;
import Rooms.EnemyRoom;
import Rooms.TreasureRoom;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<TreasureRoom> treasureRooms;
    private ArrayList<EnemyRoom> enemyRooms;

    public Game(ArrayList<TreasureRoom> treasureRooms, ArrayList<EnemyRoom> enemyRooms) {
        this.players = new ArrayList<Player>();
        this.treasureRooms = treasureRooms;
        this.enemyRooms = enemyRooms;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }


    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public int getNumberOfRooms() {
        return this.treasureRooms.size() + this.enemyRooms.size();
    }
}
