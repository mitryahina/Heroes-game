package Characters;

import KickBehaviour.GodBehaviour;
import KickBehaviour.MagicBehaviour;

public class Elf extends Character{

    public Elf(){
        super(10, 10);
    }

     public void kick(Character character){
         if(character.getPower() < this.getPower()){
             setBehaviour(new GodBehaviour());
             getBehaviour().kick(this, character);
         }
         else
             {
                 setBehaviour(new MagicBehaviour());
                 getBehaviour().kick(this, character);
             }
     }
}
