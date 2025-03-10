import java.util.Scanner;

public class Nomor5 {
    public static boolean ValidPass(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false, haslower = false, hasdigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) haslower = true;
            if (Character.isDigit(ch)) hasdigit = true;
        }

        return hasUpper && haslower && hasdigit;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (ValidPass(password)) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password invalid");
        }
        input.close();
    }
}
