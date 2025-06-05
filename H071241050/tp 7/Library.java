import java.util.ArrayList; //tipe data untuk menyimpan koleksi item
import java.util.List; //tipe data untuk menyimpan koleksi item
import java.util.NoSuchElementException; //exception yang dilempar jika item tidak ditemukan

public class Library {
    private List<LibraryItem> items; //Variabel private bertipe List yang menampung objek LibraryItem
    private List<Member> members; //Variabel private bertipe List yang menampung objek Member
    private LibraryLogger logger; //Variabel private bertipe LibraryLogger

    public Library() { //konstruktor
        items = new ArrayList<>(); //objek ArrayList kosong dan mengisinya ke variabel items (akan menampung item)
        members = new ArrayList<>(); // objek ArrayList kosong untuk daftar anggota dan mengisinya ke member
        logger = new LibraryLogger(); //objek LibraryLogger baru dan mengisinya ke variabel logger
    }

    public String addItem(LibraryItem item) { //method addItem dgn parameter item bertipe LibraryItem. mengembaliakn tipe data string sbg hasil
        items.add(item);//tambahkan objek item ke dalam daftar items
        return item.title + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) { //method findItemById menerima parameter itemId. Mengembalikan objek LibraryItem
        return items.stream() //ubah daftar items menjadi stream untuk proses filtering
                .filter(item -> item.itemId == itemId) //hanya menyimpan item dengan item.itemId sama dengan parameter itemId
                .findFirst() //Mengambil item pertama yang cocok dari hasil filter
                .orElseThrow(() -> new NoSuchElementException("Item tidak ditemukan."));
    } //Jika tidak ada item yang cocok, lempar exception NoSuchElementException dgn pesan

    public String getLibraryStatus() { //method yg mengembalikan status perpustakaan berupa string
        // objek StringBuilder bernama status yang digunakan untuk menyusun teks status perpustakaan
        StringBuilder status = new StringBuilder("| ID | Judul | Status |\n");
        for (LibraryItem item : items) { //Perulangan for-each untuk setiap objek item di dalam list items
            //Mendeklarasikan string itemStatus.
            String itemStatus = item.isBorrowed ? "Dipinjam" : "Tersedia";
            status.append("| ").append(item.itemId).append(" | ").append(item.title).append(" | ").append(itemStatus).append(" |\n");
        } //tambahkan (append) baris baru ke status berisi ID, judul, dan status item dalam format tabel
        return status.toString(); //ubah StringBuilder menjadi String biasa dan mengembalikannya
    }

    public String getAllLogs() { //method getAllLogs yang mengembalikan string berisi semua log aktivitas
        return logger.getLogs(); //panggil method getLogs() dari objek logger untuk mengambil semua catatan log
    }

    // Tambahkan getter untuk members
    public List<Member> getMembers() { //Method getter publik untuk mengakses daftar anggota perpustakaan
        return members;
    }

    // Tambahkan getter untuk logger
    public LibraryLogger getLogger() { //Method getter publik untuk mengakses objek logger
        return logger;
    }
}
