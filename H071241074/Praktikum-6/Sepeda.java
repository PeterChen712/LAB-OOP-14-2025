import java.util.Date;
import java.util.Calendar;

public class Sepeda extends Kendaraan implements Bergerak, Serviceable {
    private String jenisSepeda;
    private int jumlahGear;
    private int ukuranRoda;
    private double kecepatan;
    private Date waktuServisTerakhir;

    public Sepeda(String merek, String model) {
        super(merek, model);
        waktuServisTerakhir = new Date();
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenis) {
        this.jenisSepeda = jenis;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void setJumlahGear(int jumlah) {
        this.jumlahGear = jumlah;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(int ukuran) {
        this.ukuranRoda = ukuran;
    }

    @Override
    public double hitungPajak() {
        double biayaAdministrasi = 15000;

        return biayaAdministrasi;
    }

    @Override
    public String getTipeKendaraan() {
        return "Sepeda";
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
        cal.add(Calendar.MONTH, 6);
        return cal.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 100000;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis Sepeda: " + jenisSepeda);
        System.out.println("Jumlah Gear: " + jumlahGear);
        System.out.println("Ukuran Roda: " + ukuranRoda);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Waktu Servis Berikutnya: " + getWaktuServisBerikutnya());
        System.out.println("Biaya Servis: " + hitungBiayaServis());
        System.out.println("Pajak: " + hitungPajak());
    }
}
