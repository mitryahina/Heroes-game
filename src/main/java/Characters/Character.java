package Characters;


import KickBehaviour.Behaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@ToString
public abstract class Character {
    @Getter @Setter
    private int power;
    public static Random random = new Random();
    @Getter
    private int hp;
    @Setter @Getter
    private Behaviour behaviour;
    public abstract void kick(Character character);

    public boolean isAlive(){
        return hp > 0;
    }

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    public void setHp(int hp){
        if (hp < 0){
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }
}
