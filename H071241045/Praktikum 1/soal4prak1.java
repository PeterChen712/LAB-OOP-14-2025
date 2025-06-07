import java.util.Scanner;
public class soal4prak1 {
    public static int faktorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * faktorial(n - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan bilangan: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("faktorial dari " + n + " adalah " + faktorial(n));
    }
}