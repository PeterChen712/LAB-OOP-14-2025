public abstract class Kendaraan{
    private String id;
    private String merk;
    private String model;
    private int tahunProduksi;
    private String warna;


    public Kendaraan(String merk, String model){
        this.merk = merk;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract String getTipeKendaraan();

    public abstract double hitungPajak();

    public void tampilkanInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
    }

    
}