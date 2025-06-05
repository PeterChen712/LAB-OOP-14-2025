import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        int[][] nums = { // nums digunakan untuk mengakses elemen baris dan kolom
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Scanner scanner = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari konsol

        try { //coba menjalankan kode yang mungkin menyebabkan error
            System.out.print("Masukkan angka yang dicari: ");
            int target = scanner.nextInt(); //Membaca input bilangan bulat dari pengguna

            boolean ditemukan = false; 

            for (int i = 0; i < nums.length; i++) { //perulangan berjalan selama i kurang dari jumlah baris dalam array.
                for (int j = 0; j < nums[i].length; j++) { //Perulangan berjalan selama j kurang dari jumlah elemen dalam baris i
                    if (nums[i][j] == target) { //Memeriksa apakah elemen array sama dengan angka yang dicari
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        ditemukan = true;
                        break; 
                    }
                }
                if (ditemukan) break;
            }

            if (!ditemukan) {
                System.out.println(target + " tidak ditemukan dalam array.");
            }

        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan bulat!");
        } finally { //Blok kode yang selalu dijalankan, baik terjadi error atau tidak
            scanner.close();
        }
    }
}