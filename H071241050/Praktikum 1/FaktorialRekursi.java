import java.util.Scanner;

public class FaktorialRekursi {
    
    // Metode rekursif untuk menghitung faktorial
    public static int faktorial(int n) { //Nama metode dengan parameter n bertipe int
        
        if (n == 0 || n == 1) {
            return 1; // Basis: faktorial dari 0 atau 1 adalah 1
        } else {
            return n * faktorial(n - 1); // Rekursi: n! = n * (n-1)!
        }
    }

    public static void main(String[] args) { //args adalah nama parameter dari tipe String[] (array string)
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();

        // Menghitung faktorial menggunakan rekursi
        int hasil = faktorial(n);

        // Menampilkan hasil
        System.out.println("Output: " + hasil);

        scanner.close();
    }
}