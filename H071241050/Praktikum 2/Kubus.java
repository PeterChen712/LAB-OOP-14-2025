class Cuboid {
    double height; //double: tipe data untuk angka desimal (misal: 10.5, 30.0)
    double width;
    double length;

   double getVolume() { // method/function untuk menghitung volume.
       // Lengkapi
       return height * width * length; //rumus volume balok
   }
}

public class Kubus {
   public static void main(String[] args) {
       Cuboid cuboid = new Cuboid(); //membuat instance (objek) baru dari class Main1, cuboid: nama objek 
       // Lengkapi
       cuboid.height = 10;
       cuboid.width = 15;
       cuboid.length = 30;

       System.out.println(String.format("Volume = %2.2f", cuboid.getVolume())); //memformat string dengan angka.2 digit sebelum koma, 2 digit setelah koma.
      // memanggil method getVolume() dari objek cuboid → menghitung volume balok.
   }
}
