public class DVD extends LibraryItem { //DVD adalah subclass dari kelas LibraryItem
    private int duration; //variabel bertipe integer yang menyimpan durasi film dalam menit.

    public DVD(String title, int itemId, int duration) { //konstrruktor dgn parameter
        super(title, itemId); //super:konstruktor dari kelas induk (LibraryItem), prmeter akan diatur melalui konstruktor kelas induk
        this.duration = duration; //variabel duration milik objek DVD dengan nilai parameter duration yang diterima konstruktor.

    }

    @Override
    public String getDescription() { //method getDescription
        return "DVD: " + title + ", durasi " + duration + " menit, ID: " + itemId;
    }

    @Override
    public String borrowItem(int days) { //Method borrowItem yang mengoverride method dari kelas induk  menerima parameter days
        if (isBorrowed) {
            throw new IllegalStateException("Item sudah dipinjam."); // lempar exception IllegalStateException
        }
        if (days > 7) {
            throw new IllegalArgumentException("Durasi pinjam melebihi 7 hari.");
        }
        isBorrowed = true; //Tandai item ini sudah dipinjam dengan mengubah isBorrowed menjadi true
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) { //method calculateFine dari kelas induk
        return daysLate * 25000;
    }
}