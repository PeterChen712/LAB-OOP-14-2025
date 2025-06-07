import java.util.Date;

public class Sepeda extends Kendaraan implements IBergerak, IServiceable {
    private String jenisSepeda; //atribut
    private int jumlahGear;
    private int ukuranRoda;
    private double kecepatan;

    public Sepeda(String merek, String model) { //konstruktor
        super(merek, model);
    }

    public String getJenisSepeda() { return jenisSepeda; } //method
    public void setJenisSepeda(String jenis) { this.jenisSepeda = jenis; }

    public int getJumlahGear() { return jumlahGear; }
    public void setJumlahGear(int jumlah) { this.jumlahGear = jumlah; }

    public int getUkuranRoda() { return ukuranRoda; }
    public void setUkuranRoda(int ukuran) { this.ukuranRoda = ukuran; }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public String getTipeKendaraan() {
        return "Sepeda";
    }

    @Override
    public boolean mulai() {
        kecepatan = 5;
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
        System.out.println("Sepeda diservis.");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        return new Date(System.currentTimeMillis() + 90L * 24 * 60 * 60 * 1000);
    }

    @Override
    public double hitungBiayaServis() {
        return 100000;
    }
}