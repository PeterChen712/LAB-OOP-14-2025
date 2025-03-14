package TP2;

class Alamat {
    String jalan ;
    String kota ;
    public String getJalan() {
        return jalan;
    }
    public String getKota() {
        return kota;
    }
    public String getAlamatLengkap () {
        return jalan + ", " + kota ;
    }
}
class Mahasiswa {
    String nama ;
    String nim ;
    Alamat alamat ;


    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
   
    public String getAlamat () {
        return alamat.getAlamatLengkap () ;
    }

    
}

public class NOsalah{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalancea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
