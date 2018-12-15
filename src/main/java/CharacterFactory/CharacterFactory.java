package CharacterFactory;

import Characters.*;
import Characters.Character;
import config.Config;
import lombok.SneakyThrows;

import java.util.HashMap;

public class CharacterFactory {
    public static HashMap<Integer, Class<? extends Character>> hm;

    public CharacterFactory(){
        hm = new HashMap<Integer, Class<? extends Character>>();
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, King.class);
        hm.put(3, Knight.class);
    }

    @SneakyThrows
    public static Character createCharacter(){
        return hm.get(Config.random.nextInt(hm.size())).newInstance();

    }
}

