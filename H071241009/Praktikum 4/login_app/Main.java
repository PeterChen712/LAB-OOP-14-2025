import java.util.ArrayList;
import java.util.Scanner;

import models.Profile;
import models.User;
import utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Aplikasi Login Sederhana");
            System.out.println("-------------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Lihat Semua User");
            System.out.println("0. Keluar");
            System.out.print("> ");
    
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    showLoginMenu();
                    break;
                case "2":
                    showRegisterMenu();
                    break;
                case "3":
                    showAllUsers();
                    break;
                case "0":
                    System.out.println("Terima kasih sudah menggunakan aplikasi.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid. Coba lagi.");
            }
        }
    }
    

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
    
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.nextLine();
    
        if (username.isEmpty()) {
            System.out.println("Username tidak boleh kosong!");
            showLoginMenu();
            return;
        }
    
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
    
        if (userIndex == -1) {
            System.out.println("Username tidak ditemukan.");
            promptRetryLogin();
            return;
        }
    
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
    
        if (password.isEmpty()) {
            System.out.println("Password tidak boleh kosong!");
            promptRetryLogin();
            return;
        }
    
        boolean isPasswordMatch = listUser.get(userIndex).checkPassword(password);
    
        if (isPasswordMatch) {
            System.out.println("Berhasil Login");
            showDetailUser(listUserProfile.get(userIndex));
            System.exit(0);
        } else {
            System.out.println("Password Salah.");
            promptRetryLogin();
        }
    }

    private static void promptRetryLogin() {
        System.out.println("Coba lagi? (y/n)");
        System.out.print("> ");
        String pilihan = sc.nextLine();
    
        if (pilihan.equalsIgnoreCase("y")) {
            showLoginMenu();
        } else {
            runApp();
        }
    }    

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
    
        String username;
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            if (username.isEmpty()) {
                System.out.println("Username tidak boleh kosong!");
                continue;
            }
            boolean isUsernameTaken = false;
            for (User u : listUser) {
                if (u.getUsername().equals(username)) {
                    isUsernameTaken = true;
                    break;
                }
            }
            if (isUsernameTaken) {
                System.out.println("Username sudah digunakan, coba yang lain.");
            } else {
                break;
            }
        }
    
        String password;
        while (true) {
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password harus minimal 8 karakter.");
            } else {
                break;
            }
        }
    
        User user = new User(username, password);
        Profile profile = new Profile();
    
        String fullName;
        while (true) {
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            if (fullName.isEmpty()) {
                System.out.println("Nama lengkap tidak boleh kosong!");
            } else {
                break;
            }
        }
    
        int age;
        while (true) {
            System.out.println("Umur");
            System.out.print("> ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine(); 
                break;
            } else {
                System.out.println("Umur harus berupa angka!");
                sc.nextLine(); 
            }
        }
    
        String hobby;
        while (true) {
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (hobby.isEmpty()) {
                System.out.println("Hobby tidak boleh kosong!");
            } else {
                break;
            }
        }
    
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickName(StringUtils.getNickName(fullName));
    
        listUser.add(user);
        listUserProfile.add(profile);
    
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
    
        while (true) {
            System.out.println("Apa yang ingin kamu lakukan selanjutnya?");
            System.out.println("1. Kembali ke Menu Utama");
            System.out.println("2. Login Sekarang");
            System.out.println("0. Keluar");
            System.out.print("> ");
    
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    runApp();
                    return;
                case "2":
                    showLoginMenu();
                    return;
                case "0":
                    System.out.println("Terima kasih sudah menggunakan aplikasi.");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
    

    private static void showAllUsers() {
        System.out.println("-------------------------");
        System.out.println("DAFTAR SEMUA USER");
    
        if (listUser.isEmpty()) {
            System.out.println("Belum ada user yang terdaftar.");
        } else {
            for (int i = 0; i < listUser.size(); i++) {
                System.out.println((i + 1) + ". " +
                    listUserProfile.get(i).getFullName() +
                    " (" + listUser.get(i).getUsername() + ")");
            }
        }
        System.out.println("-------------------------");
    }    

    private static void showDetailUser(Profile profile) {
        profile.showProfile();
    }
}
