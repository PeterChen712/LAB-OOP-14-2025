import java.util.Date;

public class Motor extends Kendaraan implements IBergerak, IServiceable {
    private String jenisMotor; //atribut
    private double kapasitasTangki;
    private String tipeSuspensi;
    private double kecepatan;

    public Motor(String merek, String model) { //konstruktor
        super(merek, model);
    }

    public String getJenisMotor() { return jenisMotor; } //method
    public void setJenisMotor(String jenis) { this.jenisMotor = jenis; }

    public double getKapasitasTangki() { return kapasitasTangki; }
    public void setKapasitasTangki(double kapasitas) { this.kapasitasTangki = kapasitas; }

    public String getTipeSuspensi() { return tipeSuspensi; }
    public void setTipeSuspensi(String tipe) { this.tipeSuspensi = tipe; }

    @Override
    public double hitungPajak() {
        return kapasitasTangki * 100;
    }

    @Override
    public String getTipeKendaraan() {
        return "Motor";
    }

    @Override
    public boolean mulai() {
        kecepatan = 20;
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
        System.out.println("Motor diservis.");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        return new Date(System.currentTimeMillis() + 60L * 24 * 60 * 60 * 1000);
    }

    @Override
    public double hitungBiayaServis() {
        return 250000;
    }
}
