package PraktikumLima;

public class Fighter extends Hero {
    public Fighter(){
        this("Petarung", 100, 18);
    }
    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    
}
