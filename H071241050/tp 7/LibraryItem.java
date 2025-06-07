public abstract class LibraryItem { //abstrak: tidak bisa langsung dibuat objek dari kelas ini. Harus dibuat subclass-nya
    protected String title; //bisa diakses oleh subclass dan kelas dalam package yang sama.
    protected int itemId;
    protected boolean isBorrowed; //menyimpan status apakah item ini sedang dipinjam (true) atau tersedia (false)

    public LibraryItem(String title, int itemId) { //konstruktor kelas LibraryItem
        this.title = title; //isi properti title dari objek dengan nilai parameter title
        this.itemId = itemId; //properti itemId dengan nilai dari parameter
        this.isBorrowed = false; //pertama dibuat, item ini belum dipinjam
    }

    //abstract: method ini tidak punya isi di sini, tapi harus di-override oleh subclass seperti Book atau DVD
    public abstract String getDescription();
    public abstract String borrowItem(int days); //Method abstrak yang harus diimplementasikan di subclass
    public abstract double calculateFine(int daysLate); //Harus diisi oleh subclass. Mengembalikan angka (dalam double)

    public String returnItem() { //method nyata.bisa langsung dipakai oleh subclass
        this.isBorrowed = false; // item telah dikembalikan, dengan menyetel isBorrowed ke false
        return this.title + " dikembalikan"; 
    }
}