import java.util.Date;
import java.util.Calendar;

public class Bus extends Kendaraan implements Bergerak, Serviceable {
    private int kapasitasPenumpang;
    private int jumlahRoda;
    private double kecepatan;
    private String bahanBakar;  
    private Date waktuServisTerakhir;

    public Bus(String merek, String model) {
        super(merek, model);
        waktuServisTerakhir = new Date();
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }


    @Override
    public double hitungPajak() {
    double njkb = 20000000 + (kapasitasPenumpang * 100000) + (jumlahRoda * 500000);

    double pkb = 0.02 * njkb;

    double swdkllj = 143000;

    double pajakBahanBakar = bahanBakar.equalsIgnoreCase("solar") ? 300000 : 0;

    return pkb + swdkllj + pajakBahanBakar;
}


    @Override
    public String getTipeKendaraan() {
        return "Bus";
    }

    @Override
    public boolean mulai() {
        return true;
    }

    @Override
    public boolean berhenti() {
        kecepatan = 0;
        return true;
    }

    @Override
    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public boolean periksaKondisi() {
        return true;
    }

    @Override
    public void lakukanServis() {
        waktuServisTerakhir = new Date();
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(waktuServisTerakhir);
        cal.add(Calendar.MONTH, 3); 
        return cal.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 500000; 
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
        System.out.println("Jumlah Roda: " + jumlahRoda);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Waktu Servis Terakhir: " + waktuServisTerakhir);
        System.out.println("Waktu Servis Berikutnya: " + getWaktuServisBerikutnya());
        System.out.println("Biaya Servis: " + hitungBiayaServis());
        System.out.println("Pajak: " + hitungPajak());
    }
}
