import java.util.Scanner; // untuk membaca input dari keyboard

public class Main {
    public static void main(String[] args) { //String[] args =  Parameter untuk input dari command-line
        Scanner scanner = new Scanner(System.in); //Objek untuk membaca input pengguna.
        Library library = new Library(); // Membuat objek Library untuk mengelola item dan anggota

        while (true) { //Perulangan tak terbatas sampai pengguna memilih keluar
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item yang Dipinjam Anggota");
            System.out.println("8. Keluar");
            System.out.print("Pilihan: ");

            int choice = scanner.nextInt(); //choice :Menyimpan input angka dari pengguna
            scanner.nextLine(); //hapus sisa newline dari imput

            switch (choice) { //Menentukan tindakan berdasarkan pilihan pengguna.
                case 1 -> {
                    System.out.println("Tambahkan Item: ");
                    System.out.print("1. Buku\n2. DVD\nPilih tipe item: ");
                    int itemType = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Masukkan judul: ");
                    String title = scanner.nextLine();

                    System.out.print("Masukkan ID item: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (itemType == 1) { //membuat objek Book atau DVD dan menambahkannya ke library
                        System.out.print("Masukkan nama penulis: ");
                        String author = scanner.nextLine();
                        System.out.println(library.addItem(new Book(title, itemId, author)));
                    } else if (itemType == 2) {
                        System.out.print("Masukkan durasi (dalam menit): ");
                        int duration = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println(library.addItem(new DVD(title, itemId, duration)));
                    } else {
                        System.out.println("Tipe item tidak valid.");
                    }
                }
                case 2 -> { // objek Member baru dan menambahkannya ke daftar anggota
                    System.out.println("Tambah Anggota Baru: ");
                    System.out.print("Masukkan nama anggota: ");
                    String name = scanner.nextLine();

                    System.out.print("Masukkan ID anggota: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    library.getMembers().add(new Member(name, memberId));
                    System.out.println("Anggota berhasil ditambahkan.");
                }
                case 3 -> {
                    System.out.println("Pinjam Item: ");
                    System.out.print("Masukkan ID anggota: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan ID item: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan jumlah hari peminjaman: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();

                    try { //Mencari member dan item, lalu melakukan peminjaman
                        Member member = library.getMembers().stream()
                                .filter(m -> m.getMemberId() == memberId)
                                .findFirst()
                                .orElseThrow(() -> new IllegalArgumentException("Anggota tidak ditemukan."));

                        LibraryItem item = library.findItemById(itemId);
                        String message = member.borrow(item, days);
                        library.getLogger().logActivity(message);
                        System.out.println(message);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.println("Kembalikan Item: ");
                    System.out.print("Masukkan ID anggota: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan ID item: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan jumlah hari keterlambatan: ");
                    int daysLate = scanner.nextInt();
                    scanner.nextLine();

                    try { //Melakukan pengembalian dan mencatatnya di log.
                        Member member = library.getMembers().stream()
                                .filter(m -> m.getMemberId() == memberId)
                                .findFirst()
                                .orElseThrow(() -> new IllegalArgumentException("Anggota tidak ditemukan."));

                        LibraryItem item = library.findItemById(itemId);
                        String message = member.returnItem(item, daysLate);
                        library.getLogger().logActivity(message);
                        System.out.println(message);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 5 -> { //tampilkan semua item dan statusnya (dipinjam atau tidak)
                    System.out.println("Status Perpustakaan: ");
                    System.out.println(library.getLibraryStatus());
                }
                case 6 -> { //tampilkan seluruh log aktivitas dari sistem
                    System.out.println("Log Aktivitas: ");
                    System.out.println(library.getAllLogs());
                }
                case 7 -> { //Mencari anggota dan memanggil method untuk melihat item yang sedang dia pinjam
                    System.out.print("Masukkan ID anggota: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        Member member = library.getMembers().stream()
                                .filter(m -> m.getMemberId() == memberId)
                                .findFirst()
                                .orElseThrow(() -> new IllegalArgumentException("Anggota tidak ditemukan."));

                        member.getBorrowedItems();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 8 -> { //keluar
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
