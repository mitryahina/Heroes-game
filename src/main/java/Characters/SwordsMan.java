package Characters;

import KickBehaviour.Behaviour;

public class SwordsMan extends Character {
    public SwordsMan(int min, int max){
        super(random.nextInt(max - min + 1) + min, random.nextInt(max - min + 1) + min);

    }

    public void kick(Character character) {
        character.setHp(character.getHp() - random.nextInt(this.getPower() + 1));
        Behaviour  b = getBehaviour();
    }
}
