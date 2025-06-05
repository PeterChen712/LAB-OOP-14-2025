class Alamat {
    String jalan; //atribut bertipe teks untuk menyimpan nama jalan
    String kota; //atribut untuk menyimpan nama kota

    String getJalan(){
        return jalan;
    }

    String getKota(){
        return kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat; // class Mahasiswa memiliki objek bertipe Alamat. Jadi kita bisa menyimpan data alamat di dalam mahasiswa

    String getNama() { //method mengembalikan nilai dari atribut nama
        return nama;
    }


    String getNim() {
        return nim;
    }

    String getAlamat() { //Mengambil isi dari objek alamat, lalu menggabungkan jalan dan kota jadi satu string
        return alamat.getJalan() + ", " + alamat.getKota(); //akses atribut jalan/kota dari objek Alamat.
    }
}

public class Main { //class utama
    public static void main(String[] args) {
        // Membuat objek alamat
        Alamat alamat = new Alamat(); //membuat objek baru dari class Alamat
        alamat.jalan = "Asal Mula";
        alamat.kota = "Makassar";

        // Membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat; //mengisi atribut alamat pada objek mahasiswa dengan objek alamat yang sudah dibuat sebelumnya.
        mahasiswa.nama = "Sita Rasmi Raihana";
        mahasiswa.nim = "H071241050";

        // Output
        System.out.println("Nama: " + mahasiswa.getNama()); //memanggil method getNama
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}