
import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Avanza");
        mobil.setJumlahPintu(4);
        mobil.setJumlahKursi(8);
        mobil.setBahanBakar("Bensin");
        mobil.setKapasitasMesin(1500);
        mobil.setKecepatan(100);
        mobil.setTahunProduksi(2020);
        mobil.setWarna("Blue");

        Motor motor = new Motor("Yamaha", "Nmax");
        motor.setJenisMotor("Skuter");
        motor.setKapasitasTangki(6.5); 
        motor.setTipeSuspensi("Teleskopik"); 
        motor.setKecepatan(100);
        motor.setTahunProduksi(2021);
        motor.setWarna("Black");

        Skateboard skateboard = new Skateboard("Element", "Clasic");
        skateboard.setJenisDeck("Maple");
        skateboard.setPanjangDeck(10);
        skateboard.setPanjangDeck(10);

        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        daftarKendaraan.add(mobil);
        daftarKendaraan.add(motor);
        daftarKendaraan.add(skateboard);

        for (Kendaraan k : daftarKendaraan){
            System.out.println("Tipe: " + k.getTIPEKendaraan());
            System.out.println("Merek: " + k.getMerek());
            System.out.println("Model: " + k.getModel());
            System.out.println("Tahun Produksi: " + k.getTahunProduksi());
            System.out.println("Warna: " + k.getWarna());
            System.out.println("Pajak: " + k.hitungPajak());
           

            if (k instanceof IBergerak){
                IBergerak bergerak = (IBergerak) k;
                System.out.println("Status Mulai: " + (bergerak.mulai() ? "Berhasil" : "Gagal"));
                System.out.println("Kecepatan: " + bergerak.getKecepatan() + "km/jam");
            }

            if (k instanceof IServicable){
                IServicable servis = (IServicable) k;
                System.out.println("Biaya Servis: Rp" + servis.hitungBiayaServis());
                System.out.println("Servis berikut: " + servis.getWaktuServisBerikutnya());
                servis.lakukanServis();
            }

        }

    }
}
