package PraktikumLima;

public class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    void attack(){
        System.out.println(name + " menyerang dengan kekuatan " + attackPower);
    }
}
