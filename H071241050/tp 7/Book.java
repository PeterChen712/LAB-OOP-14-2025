public class Book extends LibraryItem { //kelas Book adalah subclass (turunan) dari kelas LibraryItem. Jadi Book mewarisi semua properti dan method dari LibraryItem.

    private String author; // hanya bisa diakses dari dalam kelas Book saja

    public Book(String title, int itemId, String author) { //konstruktor dg parameter
        super(title, itemId); //super:konstruktor dari kelas induk (LibraryItem), prmeter akan diatur melalui konstruktor kelas induk
        this.author = author; //variabel author milik objek disamakan dgn parameter author yg diterima konstruktor, jadi nilai pengarang disimpan di variabel author objek Book.
    }

    @Override //Anotasi yg menandakan method meng-override (menggantikan) method dengan nama sama di kelas induk.
    public String getDescription() { //Method getDescription
        return "Buku: " + title + " oleh " + author + ", ID: " + itemId; 
    }

    @Override
    public String borrowItem(int days) { //Method menerima parameter days (lama pinjam dalam hari)
        if (isBorrowed) {
            throw new IllegalStateException("Item sudah dipinjam."); // lempar (throw) exception bertipe IllegalStateException dengan pesan "Item sudah dipinjam.".
        }
        if (days > 14) {
            throw new IllegalArgumentException("Durasi pinjam melebihi 14 hari."); //lempar exception IllegalArgumentException dengan pesan "Durasi pinjam melebihi 14 hari."
        }
        isBorrowed = true; //Menandai item ini sudah dipinjam
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) { //method calculateFine menerima parameter dayssLate
        return daysLate * 10000; 
    }
}
