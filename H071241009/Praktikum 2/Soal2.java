import java.util.Scanner;

class Produk {
    int id;
    String nama;
    int stok;
    double harga;
    String barang;

    Produk(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    Produk(){
    }


    public void cekStok() {
        if (stok > 0) {
            System.out.println("Produk tersedia sejumlah " + stok + " stok.");
        } else {
            System.out.println("Produk tidak tersedia.");
        }
    }

    public void tambahBarang(Scanner input){
        System.out.print("Masukkan id: ");
        this.id = input.nextInt();
        System.out.print("Masukkan nama: ");
        this.nama = input.next();
        System.out.print("Masukkan stock: ");
        this.stok = input.nextInt();
        System.out.print("Masukkan harga: ");
        this.harga = input.nextDouble();

        System.out.println(this.nama);

        System.out.println(nama + " telah ditambahkan.");
    }

    public void tampilkanInfoProduk() {
        System.out.println("ID Produk     : " + this.id);
        System.out.println("Nama Produk   : " + this.nama);
        System.out.println("Stok          : " + this.stok);
        System.out.println("Harga         : Rp " + this.harga);
    }

    public void beliBarang(Scanner input){
        System.out.println("Pilih barang yang ingin Anda beli: ");
        String beliBarang = input.nextLine();
        if (stok > 0){
            System.out.println("Barang" + beliBarang + " telah dibeli");
        }
        else {
            System.out.println("Barang tidak tersedia.");
        }
    }

}

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produk produk3 = new Produk();
        while (true){
            System.out.println("Pilih Menu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Beli Barang");
            System.out.println("Ketikkan nomor pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1){
                produk3.tambahBarang(input);
            }
            else if (pilihan == 2){
                produk3.tampilkanInfoProduk();
            }
            else if (pilihan == 3){
                produk3.beliBarang(input);
            }
            else{
                break;
            }
        }


        // Produk produk1 = new Produk(101, "Sabun Mandi", 25, 5000);
        // Produk produk2 = new Produk(102, "Pasta Gigi", 0, 12000);

        // System.out.println("=== Informasi Produk 1 ===");
        // produk1.tampilkanInfoProduk();
        // produk1.cekStok();

        // System.out.println("\n=== Informasi Produk 2 ===");
        // produk2.tampilkanInfoProduk();
        // produk2.cekStok();
    }
}
