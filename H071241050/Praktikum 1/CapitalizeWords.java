import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {  //args adalah nama parameter dari tipe String[] (array string)
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari konsol

        System.out.print("Masukkan Judul Film: ");
        String input = scanner.nextLine(); //Membaca satu baris penuh dari input pengguna

        String output = CapitalizeWords(input); //Memanggil metode CapitalizeWords dengan input sebagai argumen.

        System.out.println(output); 

        scanner.close();
    }

    public static String CapitalizeWords(String text) { //Metode yang menerima input text bertipe String 
        String[] words = text.split(" "); //Memecah teks berdasarkan spasi
        String result = ""; //Variabel kosong yang akan digunakan untuk menyimpan string hasil kapitalisasi

        for (String word : words) {   //Melakukan perulangan untuk setiap kata dalam array words
            if (!word.isEmpty()) {    //Mengecek apakah kata tidak kosong (untuk menghindari error jika ada spasi ganda).
                result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim();  //Menghapus spasi di awal dan akhir string agar hasilnya rapi.

    }
}