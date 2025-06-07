class Alamat{
    String jalan;
    String kota;

    public String getJalan() {
        return jalan;
    }

    public String getKota() {
        return kota;
    }

}

class Mahasiswa{
    Alamat alamat;
    String nama;
    String nim;

    
    public String getNim() {
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat.getJalan() + ", " + alamat.getKota();
    }
}
public class livecod {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";
        mahasiswa.alamat = alamat;

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " +mahasiswa.getAlamat());
    }
}

