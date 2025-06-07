class Truk extends Kendaraan implements IBergerak{
    private int kapasitasMuatan;
    private double kecepatan;

    public Truk(String merek, String model, int kapasitasMuatan) {
        super(merek, model);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getKapasitasMuatan(){ 
        return kapasitasMuatan; 
    }

    @Override
    public double hitungPajak(){
        return kapasitasMuatan * 1000;
    }

    @Override
    public String getTipeKendaraan(){
        return "Truk";
    }

    @Override
    public boolean mulai(){ 
        return true; 
    }

    @Override
    public boolean berhenti(){ 
        return true;
    }

    @Override
    public double getKecepatan(){ 
        return kecepatan; 
    }

    @Override
    public void setKecepatan(double kecepatan){ 
        this.kecepatan = kecepatan; 
    }

}
