import java.util.Scanner;

// Superclass
class Hero {
    protected String name; //memberikan akses ke subclass
    protected int health;
    protected int attackPower;

    public Hero(String name, int health, int attackPower) {//konstruktor dgn parameter
        this.name = name; //mngisi nilai name objek dgn parameter name
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() { //method
        System.out.println(name + " menyerang dengan kekuatan " + attackPower);
    }
}

// Subclass: Archer
class Archer extends Hero {
    public Archer(String name) {
        super(name, 80, 25); //super=memanggil konstruktor hero dgn nyawa 80 dn serangan 25
    }

    @Override //menimpa method attack dri hero
    public void attack() {
        System.out.println(name + " menembakkan panah! Serangan sebesar " + attackPower);
    }
}

// Subclass: Wizard
class Wizard extends Hero {
    public Wizard(String name) {
        super(name, 60, 35);
    }

    @Override
    public void attack() {
        System.out.println(name + " mengeluarkan mantra sihir! Serangan sebesar " + attackPower);
    }
}

// Subclass: Fighter (gunakan this() di sini)
class Fighter extends Hero {
    public Fighter(String name) {
        this(name, 100, 20); // this() digunakan untuk memanggil konstruktor lain di kelas yang sama
    }

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan pedang! Serangan sebesar " + attackPower);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //objek untuk input
        Hero hero = null; 

        System.out.println("=== Pilih Karakter ===");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt(); //baca angka
        scanner.nextLine(); // buang newline 

        System.out.print("Masukkan nama karakter: ");
        String nama = scanner.nextLine();

        switch (pilihan) { //bust objek berdasarkan input
            case 1:
                hero = new Archer(nama);
                break;
            case 2:
                hero = new Wizard(nama);
                break;
            case 3:
                hero = new Fighter(nama);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return; //keluar dri program
        }

        int menu;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    hero.attack();
                    break;
                case 2:
                    System.out.println("Keluar dari game...");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 2); //ulangi menu selama tdk keluar

        scanner.close();
    }
}
