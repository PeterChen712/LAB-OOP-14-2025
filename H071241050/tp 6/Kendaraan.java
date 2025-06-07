public abstract class Kendaraan {
    protected String id; //atribut
    protected String merek;
    protected String model;
    protected int tahunProduksi;
    protected String warna;

    public Kendaraan(String merek, String model) { //konstruktor
        this.merek = merek; //atribut
        this.model = model;
    }

    public String getId() { return id; } //method
    public String getMerek() { return merek; }
    public String getModel() { return model; }
    public int getTahunProduksi() { return tahunProduksi; }
    public void setTahunProduksi(int tahun) { this.tahunProduksi = tahun; }
    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public abstract double hitungPajak();
    public abstract String getTipeKendaraan();
}
