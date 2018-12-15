package KickBehaviour;
import Characters.Character;

public class OrdinaryBehaviour implements Behaviour {
    public void kick(Character main, Character enemy) {
        enemy.setHp(main.getHp() - main.getPower());
    }
}
