class Alamat {
    String jalan;
    String kota;

    public String toString(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
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
        return alamat.toString();
    }
}

public class nomor4 {
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

