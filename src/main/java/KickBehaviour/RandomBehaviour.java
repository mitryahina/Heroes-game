package KickBehaviour;

import Characters.Character;
import config.Config;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RandomBehaviour implements Behaviour{
    public void kick(Character main, Character enemy) {
        enemy.setHp(enemy.getHp() - Config.random.nextInt(main.getPower() + 1));
    }
}
