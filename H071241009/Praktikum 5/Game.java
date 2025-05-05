import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;
        boolean running = true;

        System.out.println("Pilih Karakter:");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                hero = new Archer();
                break;
            case 2:
                hero = new Wizard();
                break;
            case 3:
                hero = new Fighter();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih aksi: ");
            int action = scanner.nextInt();

            if (action == 1) {
                hero.attack();
            } else if (action == 2) {
                System.out.println("Game selesai!");
                running = false;
            } else {
                System.out.println("Aksi tidak valid.");
            }
        }

        scanner.close();
    }
}

