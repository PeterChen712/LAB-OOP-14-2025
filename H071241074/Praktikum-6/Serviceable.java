import java.util.Date;
interface Serviceable{
    boolean periksaKondisi();
    void lakukanServis();
    Date getWaktuServisBerikutnya();
    double hitungBiayaServis();
}