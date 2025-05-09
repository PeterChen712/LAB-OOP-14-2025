public class Skateboard extends Kendaraan implements IBergerak{
    private String jenisDeck;
    private double panjangDeck;
    private double kecepatan;

    public Skateboard(String merek, String model){
        super(merek, model);
    }

    public String getJenisDeck(){
        return jenisDeck;
    }
    public void setJenisDeck(String jenisDeck){
        this.jenisDeck = jenisDeck;
    }
    public double getPanjangDeck(){
        return panjangDeck;
    }
    public void setPanjangDeck(double panjangDeck){
        this.panjangDeck = panjangDeck;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }
    @Override
    public String getTIPEKendaraan(){
        return "Skateboard";
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

