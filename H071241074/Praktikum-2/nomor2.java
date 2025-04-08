import java.util.Scanner;
public class nomor2 {
    String id;
    String nama;
    int stock;
    double harga;
    int beli;

    public nomor2(String id, String nama, int stock, double harga) {
        this.id = id;
        this.nama = nama;
        this.stock = stock;
        this.harga = harga;
    } 

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }

    public void setBuy(int yangdibeli){
        setStock(getStock() - yangdibeli);
    }

    public double getHarga() {
        return harga;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void Status(){
        System.out.println("ID: " + this.getId());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Stock: " + this.getStock());
        System.out.println("Harga: " + this.getHarga());
        System.out.println("Status: " + (this.isAvailable() ? "Tersedia" : "Tidak Tersedia"));

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ID: ");
        String id = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Stock: ");
        int stock = input.nextInt();

        System.out.print("Masukkan Harga: ");
        double harga = input.nextDouble();

        nomor2 barang = new nomor2(id, nama, stock, harga);

        barang.Status();

        System.out.println("Berapa barang yang ingin dibeli? ");
        int beli = input.nextInt();

        barang.setBuy(beli);
        System.out.println("Stock setelah dibeli: " + barang.getStock());

        input.close();
    
    }
}
