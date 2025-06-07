import java.util.Date; //Karena di dalam interface tersebut digunakan tipe data Date

public interface IServiceable {
    boolean periksaKondisi(); //method
    void lakukanServis();
    Date getWaktuServisBerikutnya();
    double hitungBiayaServis();
}