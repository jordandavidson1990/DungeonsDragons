package Behaviours;

import Rooms.EnemyRoom;

public interface Healable {

    void canBeHealed(int healingPotionValue);

    void enterEnemyRoom(EnemyRoom enemyRoom);
}
