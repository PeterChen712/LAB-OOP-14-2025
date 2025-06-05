import java.util.Date;

public class Pesawat extends Kendaraan implements IServiceable, IBergerak{

    public Pesawat(String merek, String model) {
        super(merek, model);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double hitungPajak() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungPajak'");
    }

    @Override
    public String getTipeKendaraan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipeKendaraan'");
    }

    @Override
    public boolean periksaKondisi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'periksaKondisi'");
    }

    @Override
    public void lakukanServis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lakukanServis'");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWaktuServisBerikutnya'");
    }

    @Override
    public double hitungBiayaServis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungBiayaServis'");
    }

    @Override
    public boolean mulai() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mulai'");
    }

    @Override
    public boolean berhenti() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'berhenti'");
    }

    @Override
    public double getKecepatan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getKecepatan'");
    }

    @Override
    public void setKecepatan(double kecepatan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setKecepatan'");
    }
    
}
