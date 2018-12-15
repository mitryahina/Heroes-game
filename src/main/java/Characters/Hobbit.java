package Characters;

import KickBehaviour.WeakBehaviour;

public class Hobbit extends Character {

    public Hobbit(){
        super(0, 3, new WeakBehaviour());
    }

    public void kick(Character character){
        getBehaviour().kick(this, character);
    }
}
