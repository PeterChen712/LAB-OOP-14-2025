import java.util.Date;

public class Mobil extends Kendaraan implements IBergerak, IServiceable {
    private int jumlahPintu; //atribut
    private double kapasitasMesin;
    private int jumlahKursi;
    private String bahanBakar;
    private double kecepatan;

    public Mobil(String merek, String model) { //konstruktor
        super(merek, model);
    }

    public int getJumlahPintu() { return jumlahPintu; } //method  getter
    public void setJumlahPintu(int jumlah) { this.jumlahPintu = jumlah; } //method setter

    public double getKapasitasMesin() { return kapasitasMesin; }
    public void setKapasitasMesin(double kapasitas) { this.kapasitasMesin = kapasitas; }

    public int getJumlahKursi() { return jumlahKursi; }
    public void setJumlahKursi(int jumlah) { this.jumlahKursi = jumlah; }

    public String getBahanBakar() { return bahanBakar; }
    public void setBahanBakar(String bahanBakar) { this.bahanBakar = bahanBakar; }

    @Override
    public double hitungPajak() {
        return kapasitasMesin * 150; //logika kreatif dari saya, pajak = kapasitas mesin dikali 150
    }

    @Override
    public String getTipeKendaraan() {
        return "Mobil";
    }

    @Override
    public boolean mulai() {
        kecepatan = 10;
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
        System.out.println("Mobil diservis.");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        return new Date(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000);
    }

    @Override
    public double hitungBiayaServis() {
        return 500000;
    }
}

