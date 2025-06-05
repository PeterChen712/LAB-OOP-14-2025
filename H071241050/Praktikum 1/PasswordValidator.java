import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari keyboard
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine(); //metode dari objek Scanner yang membaca satu baris input sebagai string

        // Memeriksa apakah password valid
        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") && //Matches metode untuk mencocokkan regex (regular expression) dengan password.
            password.matches(".*[a-z].*") &&
            password.matches(".*[0-9].*")) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }

        scanner.close();
    }
}