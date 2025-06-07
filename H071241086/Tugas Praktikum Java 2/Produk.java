public class Produk {
    String id;
    String nama;
    int stok;
    double harga;

    
    public Produk(String identitas, String nama, int stok, double harga) {
        this.id = identitas;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

 
    public void tampilkanInfoProduk() {
        System.out.println("ID Produk: " + id);
        System.out.println("Nama Produk: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }


    public boolean isTersedia() {
        return stok > 0;
    }


    public static void main(String[] args) {
        Produk produk1 = new Produk("P001", "Buku Tulis", 10, 5000);
       
        produk1.tampilkanInfoProduk();
        System.out.println("Tersedia di stok? " + (produk1.isTersedia() ? "Ya" : "Tidak"));

        System.out.println();
    }
}