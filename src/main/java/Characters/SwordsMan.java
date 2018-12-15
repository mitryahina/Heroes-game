package Characters;

import KickBehaviour.RandomBehaviour;

import static config.Config.random;

public class SwordsMan extends Character {
    public SwordsMan(int min, int max){
        super(random.nextInt(max - min + 1) + min, random.nextInt(max - min + 1) + min);

    }

    public void kick(Character character) {
        setBehaviour(new RandomBehaviour());
        getBehaviour().kick(this, character);
    }
}
