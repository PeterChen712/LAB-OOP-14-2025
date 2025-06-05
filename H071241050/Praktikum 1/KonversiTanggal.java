import java.util.Scanner;

public class KonversiTanggal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String input = scanner.nextLine(); //Membaca seluruh baris input pengguna sebagai string

        // Memanggil method untuk mengonversi format tanggal
        String hasil = konversiFormatTanggal(input);

        // Menampilkan hasil konversi
        System.out.println("Output: " + hasil);

        scanner.close();
    }
   
    //deklarasi metode
    public static String konversiFormatTanggal(String tanggal) {  //parameter string berisi tanggal
        // Memisahkan input berdasarkan tanda "-"
        String[] bagian = tanggal.split("-");

        if (bagian.length != 3) {
            return "Format salah!";
        }

        int hari = Integer.parseInt(bagian[0]); // Mengambil hari
        int bulan = Integer.parseInt(bagian[1]); // Mengambil bulan
        int tahun = Integer.parseInt(bagian[2]); // Mengambil tahun

        if (tahun >= 0 && tahun <= 49) { //Operator logika AND, digunakan untuk mengecek dua kondisi harus bernilai true
            tahun += 2000; 
        } else {
            tahun += 1900; 
        }

        // Array nama bulan sesuai nomor bulan
        String[] namaBulan = { 
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        // Validasi apakah bulan berada dalam rentang 1-12
        if (bulan < 1 || bulan > 12) {
            return "Bulan tidak valid!";
        }

        // Mengembalikan hasil konversi
        return hari + " " + namaBulan[bulan - 1] + " " + tahun; //bulan-1 karena array mulai dari indeks 0
    }
}