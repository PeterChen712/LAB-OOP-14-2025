public class Main {
    public static void main(String[] args) {
 
        Item irithelItem = new Item("Berserker's Fury", 90);
        Item laylaItem = new Item("Haas's Claw", 70);

        HeroML irithel = new HeroML("Irithel", 130, irithelItem);
        HeroML layla = new HeroML("Layla", 110, laylaItem);

        irithel.showInfo(); //2 Behavior (method)
        System.out.println();
        layla.showInfo();
        System.out.println();

        irithel.attack(layla);
    }
}
