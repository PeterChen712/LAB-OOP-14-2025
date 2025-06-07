package PraktikumLima;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;

        System.out.println("Pilih hero:");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.println("Masukkan Pilihan: ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                hero = new Archer("Pemanah", 100, 15); 
                break;
            case 2:
                hero = new Wizard("Penyihir", 100, 20);
                break;
            case 3:
                hero = new Fighter();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;  
        }

            
        boolean running = true;
        while (running) {
            System.out.println("\nMenu: ");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.println("Pilih aksi: ");
            int aksi = scanner.nextInt();

            switch (aksi) {
                case 1:
                    hero.attack();
                    break;
                case 2:
                    System.out.println("Game Selesai!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}

