import java.util.Scanner;
public class soal5prak1 {
    public static boolean isValidPassword(String password){
        if (password.length() < 8){
            return  false;
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false;

        for (char ch : password.toCharArray()){
            if (Character.isUpperCase(ch)){
                hasUpper = true;
            } else if (Character.isLowerCase(ch)){
                hasLower = true;
            } else if (Character.isDigit(ch)){
                hasDigit = true;
            }
        }
        return hasUpper && hasLower && hasDigit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        scanner.close();
        if (isValidPassword(password)) {
            System.out.println("password valid!");
        }else{
            System.out.println("password tidak valid");
        }

        }
    }

