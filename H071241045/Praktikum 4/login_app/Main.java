package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        while (true) {
            System.out.println("--------------------");
            System.out.println("Aplikasi Login Sederhana");
            System.out.println("--------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Lihat Semua User");
            System.out.print("> ");

            String select = sc.nextLine();
            switch (select) {  //  memilih aksi berdasarkan input user yang disimpan dalam variabel select 
                case "1":
                    showLoginMenu();
                    break;
                case "2":
                    showRegisterMenu();
                    break;
                case "3":
                    showAllRegisteredUsers();
                    break;
                default:
                    System.out.println("Menu tidak valid! Pilih 1, 2 atau 3.");
            }
        }
    }

    private static void showLoginMenu() {
        while (true) {
            System.out.println("--------------------");
            System.out.println("Login (ketik '0' untuk kembali)");
            System.out.print("Masukkan Username\n> ");
            String username = sc.nextLine();

            if (username.equals("0")) {
                return;
            }

            int userIndex = -1; 
            for (int i = 0; i < listUser.size(); i++) { 
                if (listUser.get(i).getUsername().equals(username)) { 
                    userIndex = i; 
                    break;
                }
            }

            if (userIndex != -1) {
                System.out.print("Password\n> ");
                String password = sc.nextLine();

                boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
                if (isPasswordMatch) {
                    System.out.println("Berhasil Login!");
                    showUserMenu(listUser.get(userIndex));
                    return;
                } else {
                    System.out.println("Password salah. Coba lagi.\n");
                }
            } else {
                System.out.println("Username tidak ditemukan. Coba lagi.\n");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("--------------------");
        System.out.println("REGISTER");

        String username;
        while (true) {
            System.out.print("Username\n> ");
            username = sc.nextLine();
            if (username.trim().isEmpty()) {
                System.out.println("Username tidak boleh kosong!");
            } else if (isUsernameTaken(username)) {
                System.out.println("Username sudah digunakan!");
            } else {
                break;
            }
        }

        String password;
        while (true) {
            System.out.print("Password\n> ");
            password = sc.nextLine();
            if (password.isEmpty()) {
                System.out.println("Password tidak boleh kosong!");
            } else if (password.length() < 8) {
                System.out.println("Password harus minimal 8 karakter!");
            } else {
                break;
            }
        }

        String fullName;
        while (true) {
            System.out.print("Nama Lengkap\n> ");
            fullName = sc.nextLine();
            if (fullName.trim().isEmpty()) {
                System.out.println("Nama Lengkap tidak boleh kosong!");
            } else {
                break;
            }
        }

        int age;
        while (true) {
            System.out.print("Umur\n> ");
            String input = sc.nextLine();
            try {
                age = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Umur harus berupa angka!");
            }
        }

        String hobby;
        while (true) {
            System.out.print("Hobby\n> ");
            hobby = sc.nextLine();
            if (hobby.trim().isEmpty()) {
                System.out.println("Hobby tidak boleh kosong!");
            } else {
                break;
            }
        }

        String nickName = StringUtils.generateNickName(fullName);
        System.out.println("nama panggilan\n> " + nickName);  
        Profile profile = new Profile(fullName, age, hobby, nickName);
        User user = new User(username, password, profile);
        listUser.add(user);

        System.out.println("--------------------");
        System.out.println("Berhasil Membuat User Baru!!");
    }
    private static boolean isUsernameTaken(String username) {
        for (User user : listUser) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    private static void showUserMenu(User user) {
        while (true) {
            System.out.println("====================");
            System.out.println("Selamat datang, " + user.getProfile().getNickName() + "!");
            System.out.println("1. Lihat Profil");
            System.out.println("2. Logout");
            System.out.print("> ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    showDetailUser(user.getProfile());
                    break;
                case "2":
                    System.out.println("Berhasil Logout. Kembali ke menu utama.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("====================");
        System.out.println("DETAIL PENGGUNA");
        System.out.println("Nama Lengkap : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur : " + profile.getAge());
        System.out.println("Hobby : " + profile.getHobby());
        System.out.println("====================");
    }
    private static void showAllRegisteredUsers() {
        System.out.println("====================");
        System.out.println("DAFTAR USER TERDAFTAR:");

        if (listUser.isEmpty()) {
            System.out.println("Belum ada user yang terdaftar.");
        } else {
            for (int i = 0; i < listUser.size(); i++) {
                User user = listUser.get(i);
                System.out.println((i + 1) + ". Username: " + user.getUsername());
            }
        }

        System.out.println("====================");
    }
   
}
