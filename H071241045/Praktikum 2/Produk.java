public class Produk {
    // akses privat, yang hanya dapat di akses dalam kelas ini saja
    private String id;
    private String nama;
    private int stok;
    private double harga;

    // membuat constructor untuk objek baru dengan nilai awal
    // tujuannya untuk mengisi atribut ketika objeknya dibuat, bisa langsung mengisi nilainya saat objek dibuat
    public Produk(String id, String nama, int stok, double harga){
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    // membuat method dengan getId untuk mengambil nilai atribut dari luar kelas
    public String getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public double getHarga(){
        return harga;
    }
    // membuat method dengan setStok untuk mengubah nilai atribut dari luas kelas
    public void setStok(int stok){
        this.stok = stok;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    // membuat method untuk mengecek ketersediaan
    public boolean isTersedia(){
        return stok > 0;
    }
    public void tampilkanInfo(){
        System.out.println("ID produk : " + id);
        System.out.println("nama produk : " + nama);
        System.out.println("stok produk : " + stok);
        System.out.println("harga Rp : " + String.format ("%,.0f", harga));
        System.out.println("status : " + (isTersedia() ? "tersedia" : "habis"));
        System.out.println("-------------------");
    }
    // selanjutnya membuat untuk titik awal program dijalankan
    public static void main(String[] args){
        Produk produk1 = new Produk("P001", "Laptop ASUS", 10, 7500000);
        Produk produk2 = new Produk("P002", "Laptop Acer", 0, 1500000);

        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
    }

}
