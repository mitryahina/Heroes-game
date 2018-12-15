package Characters;

public class Elf extends Character{

    public Elf(){
        super(10, 10);
    }

     public void kick(Character character){
         if(character.getPower() < this.getPower()){
             character.setHp(0);
             System.out.println(character + " killed!");
         }
         else
             {
                 character.setHp(character.getHp() - 1);
             }
     }
}
