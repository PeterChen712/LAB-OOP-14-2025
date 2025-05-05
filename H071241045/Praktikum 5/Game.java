import java.util.Scanner;

class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(){
        System.out.println( name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}

class Archer extends Hero{
    public Archer(String name){
        super(name, 80, 15);
    }

    @Override
    public  void attack(){
        System.out.println( name + " menembakkan panah dengan kekuatan " + attackPower +"!");
    }
}

class Wizard extends Hero{
    public Wizard(String name){
        super(name, 70, 20);
    }

    @Override
    public void attack(){
        System.out.println( name + " melemparkan mantra sihir dengan kekuatan " + attackPower + "!");
    }
}

class Fighter extends Hero{
    public Fighter(String name){
        this(name, 100, 10);
    }

    public Fighter(String name, int health, int attackPower){
        super(name, health, attackPower);
    }
   
    @Override
    public void attack(){
        System.out.println( name + " menghantam musuh dengan kekuatan " + attackPower + "!");
    }
}

public class Game{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Hero hero = null;

        System.out.println("=== Pilih Karakter ===");
        System.out.println("1. Pemanah (Archer)");
        System.out.println("2. Penyihir (Wizard)");
        System.out.println("3. Petarung (Fighter)");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        // String name = scanner.nextLine();

        String name = " ";

        switch (pilihan){
            case 1:
                System.out.print("Masukkan nama karakter anda: ");
                name = scanner.nextLine();
                hero = new Archer(name);
                break;
            case 2:
                System.out.print("Masukkan nama karakter anda: ");
                name = scanner.nextLine();
                hero = new Wizard(name);
                break;
            case 3:
                System.out.print("Masukkan nama karakter anda: ");
                name = scanner.nextLine();
                hero = new Fighter(name);
                break;
            default:
                System.out.println("Pilihan tidak valid. keluar dari program.");
                System.exit(0);
        }

        boolean running = true;
        while(running){
            System.out.println("\n=== Menu ===");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilihan Anda: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu){
                case 1:
                    hero.attack();
                    break;
                case 2:
                    System.out.println("Terima kasih telah bermain!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        scanner.close();
    }
}

