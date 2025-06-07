import java.util.Scanner;

class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " menyerang " + enemy.name + " dengan kekuatan " + attackPower + "!");
        enemy.health -= attackPower;
        if (enemy.health <= 0) {
            enemy.health = 0;
            System.out.println(enemy.name + " telah dikalahkan!");
        } else {
            System.out.println(enemy.name + " tersisa " + enemy.health + " HP.");
        }
    }

    public void showStatus() {
        System.out.println("Nama: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }
}

class Enemy {
    String name;
    int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void showStatus() {
        System.out.println("Musuh: " + name);
        System.out.println("Health: " + health);
    }
}

class Archer extends Hero {
    public Archer(String name) {
        super(name, 80, 15);
    }

    @Override
    public void attack(Enemy enemy) {
        System.out.println(name + " menembakkan panah ke " + enemy.name + " dengan kekuatan " + attackPower + "!");
        super.attack(enemy);
    }
}

class Wizard extends Hero {
    public Wizard(String name) {
        super(name, 70, 20);
    }

    @Override
    public void attack(Enemy enemy) {
        System.out.println(name + " melemparkan mantra ke " + enemy.name + " dengan kekuatan " + attackPower + "!");
        super.attack(enemy);
    }
}

class Fighter extends Hero {
    public Fighter(String name) {
        super(name, 100, 10);
    }

    @Override
    public void attack(Enemy enemy) {
        System.out.println(name + " menghantam " + enemy.name + " dengan kekuatan " + attackPower + "!");
        super.attack(enemy);
    }
}

public class Bermain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;

        System.out.println("=== Pilih Karakter ===");
        System.out.println("1. Pemanah (Archer)");
        System.out.println("2. Penyihir (Wizard)");
        System.out.println("3. Petarung (Fighter)");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan nama karakter Anda: ");
        String name = scanner.nextLine();

        switch (pilihan) {
            case 1:
                hero = new Archer(name);
                break;
            case 2:
                hero = new Wizard(name);
                break;
            case 3:
                hero = new Fighter(name);
                break;
            default:
                System.out.println("Pilihan tidak valid. Keluar dari program.");
                System.exit(0);
        }

        Enemy enemy = new Enemy("Goblin", 50);

        boolean running = true;
        while (running) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Serang Musuh");
            System.out.println("2. Lihat Status Karakter");
            System.out.println("3. Lihat Status Musuh");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    if (enemy.health > 0) {
                        hero.attack(enemy);
                    } else {
                        System.out.println("Musuh sudah dikalahkan!");
                    }
                    break;
                case 2:
                    System.out.println("\n-- Status Karakter --");
                    hero.showStatus();
                    break;
                case 3:
                    System.out.println("\n-- Status Musuh --");
                    enemy.showStatus();
                    break;
                case 4:
                    System.out.println("Terima kasih telah bermain!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
