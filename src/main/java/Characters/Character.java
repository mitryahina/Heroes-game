package Characters;

import KickBehaviour.Behaviour;
import lombok.Getter;
import lombok.Setter;


public abstract class Character {
    @Getter @Setter
    private int power;
    @Getter
    private int hp;
    @Setter @Getter
    private Behaviour behaviour;
    public abstract void kick(Character character);

    public boolean isAlive()
    { if (hp == 0){
        System.out.println(getClass().getSimpleName() + " killed!");
    }
        return hp > 0;
    }

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }
    public Character(int power, int hp, Behaviour b){
        this.power = power;
        this.hp = hp;
        this.behaviour = b;
    }

    public void setHp(int hp){
        if (hp < 0){
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    public String toString(){
        return getClass().getSimpleName() + "(hp: " + getHp() + ", power: " + getPower() + ")";
    }
}
