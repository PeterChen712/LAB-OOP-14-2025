class Alamat{
    String jalan;
    String kota;

    public String getAlamat(){
        return jalan + kota;
    }
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getAlamat(){
        return alamat.getAlamat();
    }
}

public class DataDiri{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah" + ",";
        alamat.kota = " " + "Makassar" ;

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Shabrina";
        mahasiswa.nim = "H071241045";

        System.out.println("nama : " + mahasiswa.getNama());
        System.out.println("nim : " + mahasiswa.getNim());
        System.out.println("alamat : " + mahasiswa.getAlamat());
    }
}