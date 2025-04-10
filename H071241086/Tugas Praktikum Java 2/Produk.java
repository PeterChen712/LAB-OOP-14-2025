public class Produk {
    private String id;
    private String nama;
    private int stok;
    private double harga;

    public Produk(String id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilkanData() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    public boolean cekKetersediaan() {
        return stok > 0;
    }

    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Smartphone", 10, 2500000);
        p1.tampilkanData();

        if (p1.cekKetersediaan()) {
            System.out.println("Produk masih tersedia.");
        } else {
            System.out.println("Produk sudah habis.");
        }
    }
}