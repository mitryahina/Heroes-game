package Characters;

public class Hobbit extends Character {

    public Hobbit(){
        super(0, 3);
    }

    public void kick(Character character){
        toCry();
    }

    private void toCry(){
        System.out.println("Cry cry cry");
    }

}
