import java.util.ArrayList; //menyimpan daftar item yang dipinjam oleh anggota
import java.util.List;

public class Member {
    private String name;  ///Menyimpan nama anggota.
    private int memberId;
    private List<LibraryItem> borrowedItems; // Daftar item perpustakaan yang dipinjam anggota
    //LibraryItem = Tipe item (bisa Book, DVD, dll)

    public Member(String name, int memberId) { //Konstruktor dipanggil saat objek Member dibuat
        this.name = name; //this name= variabel dalam kelas, name : parameter
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>(); //buat list kosong untuk item yang dipinjam
    }

    // Tambahkan getter untuk memberId, method ini mengembalikan memberId anggota.
    public int getMemberId() {
        return memberId;
    }

    public String borrow(LibraryItem item, int days) { //method meminjam item dari perpustakaan
        if (item.isBorrowed) {
            throw new IllegalStateException("Item sudah dipinjam.");
        }
        String result = item.borrowItem(days); //pinjam item menggunakan method borrowItem() dari LibraryItem
        borrowedItems.add(item); //tambahkan item ke daftar yang sedang dipinjam
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate) { //method utk mengembalikan item dan menghitung denda jika terlambat.
        if (!borrowedItems.contains(item)) { //Cek apakah item sedang dipinjam oleh anggota ini
            throw new IllegalStateException("Item tidak ditemukan dalam daftar peminjaman.");
        }
        borrowedItems.remove(item); //Menghapus item dari daftar pinjaman
        double fine = item.calculateFine(daysLate); //Hitung denda keterlambatan berdasarkan hari terlambat
        return item.returnItem() + " dengan denda: Rp " + fine;
    } //Kembalikan pesan bahwa item sudah dikembalikan beserta jumlah dendanya

    public void getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam");
        } else {
            System.out.println("| ID | Judul | Status |");
            for (LibraryItem item : borrowedItems) {
                System.out.println("| " + item.itemId + " | " + item.title + " | Dipinjam |");
            }
        }
    }
}
