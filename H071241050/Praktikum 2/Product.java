import java.util.Scanner; //Mengimpor class Scanner dari library Java

public class Product { 
    //atribut/variabel dari class Product:
    String id;
    String name;
    int stock; //bilangan bulat 
    double price; //pakai double karena bisa punya koma, contoh: 3.500,50

    void showInfo() { //method 
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Stok: " + stock);
        System.out.println("Harga: Rp" + price);
        
        if (stock > 0) {
            System.out.println("Status: Tersedia");
        } else {
            System.out.println("Status: Habis");
        }
    }

    public Product(String id) { //konstruktor id
        this.id = id //objek sebuah class
      
    }

    public static void main(String[] args) { //method yang akan dipanggil ketika program dijalankan
        Scanner input =new Scanner(System.in);
        String id = input.nextLine(); // nextline penting kalau kita ingin membaca kalimat lengkap atau input dengan spasi
        String name = input.nextLine();
        int stock = input.nextInt(); // membaca angka bulat (tipe int) dari user
        input.nextLine(); //pakai nextLine() untuk "membersihkan sisa enter" agar input berikutnya tidak terganggu. Scanner tdk otomatis buang karakter newline (\n) yang terjadi saat kita menekan Enter
        double price = input.nextDouble(); // membaca angka pecahan (desimal)
        input.nextLine(); //membersihkan newline setelah nextDouble()
        
        Product t = new Product();
        //Mengisi data ke objek t dengan input yang diberikan user tadi
        t.id = id;
        t.name = name;
        t.stock = stock;
        t.price = price;


        Product p = new Product();
        //Mengisi data secara manual (hardcoded), bukan dari input (Objek ini tidak digunakan karena tidak dipanggil.)
        p.id = "A01";
        p.name = "Sabun Mandi";
        p.stock = 5;
        p.price = 3500;

        t.showInfo(); //Memanggil method showInfo() dari objek t untuk menampilkan data produk yang sudah diisi user
    }
}

