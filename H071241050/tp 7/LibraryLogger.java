import java.time.LocalDateTime; //digunakan untuk mendapatkan waktu dan tanggal saat ini
import java.time.format.DateTimeFormatter; //mengatur format penulisan waktu (misalnya: 2025-06-05 14:30:00)
import java.util.ArrayList; //menyimpan banyak elemen (log aktivitas)
import java.util.List;

public class LibraryLogger { 
    private List<String> logs; //daftar/list yg simpan elemen bertipe String.simpan catatan aktivitas dalam bentuk teks.

    public LibraryLogger() { //konstruktor
        logs = new ArrayList<>(); //Inisialisasi logs sebagai ArrayList kosong, siap untuk diisi dengan log aktivitas
    }

    public void logActivity(String activity) { //Method untuk mencatat satu aktivitas baru ke log
        //ambil waktu sekarang, ubah waktu ke format: "tahun-bulan-hari jam:menit:detik", simpan di variabel timestamp
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        logs.add(timestamp + " " + activity);
    } //Menambahkan teks log baru ke dalam logs, dalam format:  "2025-06-05 14:30:00 Peminjaman buku Harry Potter".

    public String getLogs() { //method ambil semua log dalam satu String
        return String.join("\n", logs); //Gabungkan semua elemen di list logs, pisahkan pakai newline (\n), satu baris per aktivitas.
    }

    public void clearLogs() { //method hapus seluruh isi log.
        logs.clear(); //Mengosongkan list logs
    }
}
