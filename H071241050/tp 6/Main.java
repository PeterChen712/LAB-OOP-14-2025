public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Avanza");
        mobil.setKapasitasMesin(1.5);
        mobil.setJumlahPintu(4);
        mobil.setBahanBakar("Bensin");
        mobil.setWarna("Hitam");
        System.out.println("Pajak Mobil: " + mobil.hitungPajak());

        Motor motor = new Motor("Honda", "Vario");
        motor.setKapasitasTangki(5);
        motor.setJenisMotor("Skutik");
        System.out.println("Pajak Motor: " + motor.hitungPajak());

        Sepeda sepeda = new Sepeda("Polygon", "Xtrada");
        sepeda.setJumlahGear(21);
        System.out.println("Pajak Sepeda: " + sepeda.hitungPajak());

        SkuterListrik skuter = new SkuterListrik("Xiaomi", "M365");
        skuter.setKapasitasBaterai(6.4);
        System.out.println("Pajak Skuter Listrik: " + skuter.hitungPajak());
    }
}

