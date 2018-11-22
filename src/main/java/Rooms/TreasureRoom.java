package Rooms;

import java.util.ArrayList;

public class TreasureRoom {

    private int treasure;

    public TreasureRoom(int treasure) {
        this.treasure = treasure;
    }

    public int getTreasureValue() {
        return treasure;
    }

    public void emptyTreasure(){
        this.treasure = 0;
    }
}
