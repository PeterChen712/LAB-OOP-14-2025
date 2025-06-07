public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Avanza");
        mobil.setJumlahPintu(4);
        mobil.setKapasitasMesin(1.5);
        mobil.setJumlahKursi(7);
        mobil.setBahanBakar("Bensin");
        mobil.setKecepatan(120);

        Motor motor = new Motor("Honda", "Vario");
        motor.setJenisMotor("Matic");
        motor.setKapasitasTangki(5.5);
        motor.setTipeSuspensi("Teleskopik");
        motor.setKecepatan(80);

        Sepeda sepeda = new Sepeda("Polygon", "Premier 5");
        sepeda.setJenisSepeda("Gunung");
        sepeda.setJumlahGear(21);
        sepeda.setUkuranRoda(27);
        sepeda.setKecepatan(25);

        Truk truk = new Truk("Hino", "Dutro", 500);
        truk.setKecepatan(60);

        System.out.println("=== Info Mobil ===");
        System.out.println("Tipe: " + mobil.getTipeKendaraan());
        System.out.println("Pajak: Rp" + mobil.hitungPajak());
        System.out.println("Kecepatan: " + mobil.getKecepatan() + " km/jam");
        mobil.mulai();
        mobil.periksaKondisi();
        mobil.lakukanServis();
        System.out.println("Biaya Servis: Rp" + mobil.hitungBiayaServis());
        System.out.println("Servis Berikutnya: " + mobil.getWaktuServisBerikutnya());

        System.out.println("\n=== Info Motor ===");
        System.out.println("Tipe: " + motor.getTipeKendaraan());
        System.out.println("Pajak: Rp" + motor.hitungPajak());
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/jam");
        motor.mulai();
        motor.periksaKondisi();
        motor.lakukanServis();
        System.out.println("Biaya Servis: Rp" + motor.hitungBiayaServis());
        System.out.println("Servis Berikutnya: " + motor.getWaktuServisBerikutnya());

        System.out.println("\n=== Info Sepeda ===");
        System.out.println("Tipe: " + sepeda.getTipeKendaraan());
        System.out.println("Pajak: Rp" + sepeda.hitungPajak());
        System.out.println("Kecepatan: " + sepeda.getKecepatan() + " km/jam");
        sepeda.mulai();
        sepeda.periksaKondisi();
        sepeda.lakukanServis();
        System.out.println("Biaya Servis: Rp" + sepeda.hitungBiayaServis());
        System.out.println("Servis Berikutnya: " + sepeda.getWaktuServisBerikutnya());

        System.out.println("\n=== Info Truk ===");
        System.out.println("Tipe: " + truk.getTipeKendaraan());
        System.out.println("Pajak: Rp" + truk.hitungPajak());
        System.out.println("Kecepatan: " + truk.getKecepatan() + " km/jam");
        truk.mulai();
    }
}