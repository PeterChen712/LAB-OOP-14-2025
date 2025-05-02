public class Main {
    public static void main(String[] args) {
       Barang lukisan = new Barang("Lukisan", 140);
       Barang cangkir = new Barang("Cangkir", 20);

       RobotPekerja r1 = new RobotPekerja("Yanto", 0, new Barang());
       RobotPekerja r2 = new RobotPekerja("Budi", 0, new Barang());
        
       r1.ambilBarang(cangkir);
       r2.ambilBarang(lukisan);

       r1.aduRobot(r2);
       
    }
}