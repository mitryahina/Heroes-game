package KickBehaviour;
import Characters.Character;

public class MagicBehaviour implements Behaviour {
    public void kick(Character main, Character enemy) {
        enemy.setPower(enemy.getPower() - 1);
    }
}

