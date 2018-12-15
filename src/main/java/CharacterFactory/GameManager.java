package CharacterFactory;

import Characters.Character;
import Characters.Elf;
import Characters.Hobbit;
import lombok.Getter;


public class GameManager {
    private CharacterFactory cf;
    @Getter
    public Character c1;
    @Getter
    public Character c2;

    public GameManager(){
        cf = new CharacterFactory();
        do{
        this.c1 = cf.createCharacter();
        this.c2 = cf.createCharacter();
        }
        // Kostyl to avoid endless fights between 2 hobbits or 2 elves
        while((c1 instanceof Hobbit && c2 instanceof Hobbit)||(c1 instanceof Elf && c2 instanceof Elf) );
    }


    public void fight() {
        System.out.println(c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName() + " fighting");

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1 + " kicks " + c2);
            c1.kick(c2);
            System.out.println(c2 + " kicks " + c1);
            c2.kick(c1);
        }

        if(c1.isAlive()){
            System.out.println(c1.getClass().getSimpleName() + " wins!");
        }
        else{
            System.out.println(c2.getClass().getSimpleName() + " wins!");
        }
    }
}
