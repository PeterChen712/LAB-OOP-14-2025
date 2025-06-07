public class SkuterListrik extends Kendaraan implements IBergerak {
    private double kapasitasBaterai; //atribut 
    private double kecepatan;

    public SkuterListrik(String merek, String model) { //konstruktor
        super(merek, model);
    }

    public double getKapasitasBaterai() { return kapasitasBaterai; } //method
    public void setKapasitasBaterai(double kapasitas) { this.kapasitasBaterai = kapasitas; }

    @Override
    public double hitungPajak() {
        return kapasitasBaterai * 50;
    }

    @Override
    public String getTipeKendaraan() {
        return "Skuter Listrik";
    }

    @Override
    public boolean mulai() {
        kecepatan = 15;
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
}
