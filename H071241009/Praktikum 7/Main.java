import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int itemCounter = 1, memberCounter = 1;

        while (true) {
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item\n2. Tambah Anggota\n3. Pinjam Item\n4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan\n6. Lihat Log Aktivitas\n7. Lihat Item yang Dipinjam Anggota\n8. Keluar");
            System.out.print("Pilih opsi: ");

            int opsi;
            try {
                opsi = sc.nextInt(); 
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                sc.nextLine(); 
                continue;
            }

            try {
                switch (opsi) {
                    case 1 -> {
                        System.out.print("Jenis item (1: Buku, 2: DVD): ");
                        int jenis = sc.nextInt(); sc.nextLine();
                        if (jenis == 1) {
                            System.out.print("Judul: ");
                            String judul = sc.nextLine();
                            System.out.print("Penulis: ");
                            String penulis = sc.nextLine();
                            lib.addItem(new Book(judul, itemCounter++, penulis));
                            System.out.println("Buku berhasil ditambahkan.");
                        } else if (jenis == 2) {
                            System.out.print("Judul: ");
                            String judul = sc.nextLine();
                            System.out.print("Durasi (menit): ");
                            int durasi = sc.nextInt(); sc.nextLine();
                            lib.addItem(new DVD(judul, itemCounter++, durasi));
                            System.out.println("DVD berhasil ditambahkan.");
                        } else {
                            System.out.println("Jenis item tidak dikenal.");
                        }
                    }

                    case 2 -> {
                        System.out.print("Nama Anggota: ");
                        String nama = sc.nextLine();
                        System.out.println(lib.addMember(new Member(nama, memberCounter++)));
                    }

                    case 3 -> {
                        try {
                            System.out.print("ID Item: ");
                            int idItem = sc.nextInt();
                            System.out.print("ID Anggota: ");
                            int idAnggota = sc.nextInt();
                            System.out.print("Jumlah hari peminjaman: ");
                            int hari = sc.nextInt(); sc.nextLine();

                            LibraryItem item = lib.findItemById(idItem);
                            Member m = lib.findMemberById(idAnggota);

                            if (item == null) {
                                System.out.println("Item dengan ID tersebut tidak ditemukan.");
                                continue;
                            }
                            if (m == null) {
                                System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
                                continue;
                            }

                            String hasil = m.borrow(item, hari);
                            lib.getLogger().logActivity(item.getDescription() + " dipinjam oleh " + m.getName());
                            System.out.println(hasil);
                        } catch (InputMismatchException e) {
                            System.out.println("Input tidak valid. Harap masukkan angka.");
                            sc.nextLine();
                        }
                    }

                    case 4 -> {
                        try {
                            System.out.print("ID Item: ");
                            int idItem = sc.nextInt();
                            System.out.print("ID Anggota: ");
                            int idAnggota = sc.nextInt();
                            System.out.print("Jumlah hari keterlambatan: ");
                            int terlambat = sc.nextInt(); sc.nextLine();

                            LibraryItem item = lib.findItemById(idItem);
                            Member m = lib.findMemberById(idAnggota);

                            if (item == null) {
                                System.out.println("Item dengan ID tersebut tidak ditemukan.");
                                continue;
                            }
                            if (m == null) {
                                System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
                                continue;
                            }

                            String hasil = m.returnItem(item, terlambat);
                            lib.getLogger().logActivity(item.getDescription() + " dikembalikan oleh " + m.getName());
                            System.out.println(hasil);
                        } catch (InputMismatchException e) {
                            System.out.println("Input tidak valid. Harap masukkan angka.");
                            sc.nextLine();
                        }
                    }

                    case 5 -> {
                        System.out.println(lib.getLibraryStatus());
                    }

                    case 6 -> {
                        System.out.println(lib.getLogger().getLogs());
                    }

                    case 7 -> {
                        try {
                            System.out.print("ID Anggota: ");
                            int idAnggota = sc.nextInt(); sc.nextLine();
                            Member m = lib.findMemberById(idAnggota);
                            if (m == null) {
                                System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
                            } else {
                                System.out.println(m.getBorrowedItems());
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Input tidak valid. Harap masukkan angka.");
                            sc.nextLine();
                        }
                    }

                    case 8 -> {
                        System.out.println("Keluar dari sistem.");
                        return;
                    }

                    default -> System.out.println("Opsi tidak valid. Silakan pilih antara 1 hingga 8.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }
}
