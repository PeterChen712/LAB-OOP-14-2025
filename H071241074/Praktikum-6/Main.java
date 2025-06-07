public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Avanza");
        mobil.setJumlahPintu(4);
        mobil.setKapasitasMesin(1.5);
        mobil.setJumlahKursi(7);
        mobil.setBahanBakar("Bensin");
        mobil.setKecepatan(80);
        mobil.lakukanServis();
        mobil.getWaktuServisBerikutnya();

        Motor motor = new Motor("Honda", "Vario");
        motor.setJenisMotor("Skuter");
        motor.setKapasitasTangki(5);
        motor.setTipeSuspensi("Telescopic");
        motor.setKecepatan(60);
        motor.lakukanServis();
        motor.getWaktuServisBerikutnya();

        Sepeda sepeda = new Sepeda("Polygon", "Premier 5");
        sepeda.setJenisSepeda("Gunung");
        sepeda.setJumlahGear(21);
        sepeda.setUkuranRoda(27);
        sepeda.setKecepatan(20);
        sepeda.lakukanServis();
        sepeda.getWaktuServisBerikutnya();

        Bus bus = new Bus("Mercedes", "Sprinter");
        bus.setKapasitasPenumpang(50);
        bus.setJumlahRoda(8);
        bus.setKecepatan(60);
        // bus.lakukanServis();
        bus.setBahanBakar("solar");
        bus.getWaktuServisBerikutnya();

        System.out.println("=== DATA MOBIL ===");
        mobil.tampilkanInfo();
        System.out.println("");
        System.out.println("=== DATA MOTOR ===");
        motor.tampilkanInfo();
        System.out.println("");
        System.out.println("=== DATA SEPEDA ===");
        sepeda.tampilkanInfo();
        System.out.println("");
        System.out.println("=== DATA BUS ===");
        bus.tampilkanInfo();

    }
}
