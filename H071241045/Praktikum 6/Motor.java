import java.util.Date;

public class Motor extends Kendaraan implements IBergerak, IServicable{
    private String jenisMotor;
    private String tipeSuspensi;
    private double kecepatan;
    private double kapasitasTangki;

    public Motor(String merek, String model){
        super(merek, model);
    }

    public String getJenisMotor(){
        return jenisMotor;
    }
    public void setJenisMotor(String jenis){
        this.jenisMotor = jenis;
    }
    public double getKapasitasTangki(){
        return kapasitasTangki;
    }
    public void setKapasitasTangki(double kapasitas){
        this.kapasitasTangki = kapasitas;
    }
    public String getTipeSuspensi(){
        return tipeSuspensi;
    }
    public void setTipeSuspensi(String tipe){
        this.tipeSuspensi = tipe;
    }

    @Override
    public double hitungPajak(){
        return kapasitasTangki * 0.9;
    }
    @Override
    public String getTIPEKendaraan(){
        return "Motor";
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
    @Override
    public boolean periksaKondisi(){
        return true;
    }
    @Override
    public void lakukanServis(){
        System.out.println("Motor diservis");
    }
    @Override
    public Date getWaktuServisBerikutnya(){
        return new Date();
    }
    @Override
    public double hitungBiayaServis(){
        return 300_000;
    }
}