class Alamat {
    String jalan;
    String kota;
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getName() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getAlamat() {
        return alamat.jalan + ", " + alamat.kota;
    }
}

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Habibu Kulle";
        alamat.kota = "Gowa";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Siti";
        mahasiswa.nim = "H071241086";

        System.out.println("Nama: " + mahasiswa.getName());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}