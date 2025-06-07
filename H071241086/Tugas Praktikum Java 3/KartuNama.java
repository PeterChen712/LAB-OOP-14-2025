public class KartuNama {
    String nama;
    String jabatan;
    String perusahaan;

    public KartuNama() {
        this.nama = "Nama Anda";
        this.jabatan = "Jabatan Anda";
        this.perusahaan = "Perusahaan Anda";
    }

    public KartuNama(String nama, String jabatan, String perusahaan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.perusahaan = perusahaan;
    }


    public void tampilkanKartu() {
        System.out.println("===== KARTU NAMA DIGITAL =====");
        System.out.println("Nama       : " + nama);
        System.out.println("Jabatan    : " + jabatan);
        System.out.println("Perusahaan : " + perusahaan);
        System.out.println("==============================");
    }

    public void perbaruiInfo(String nama, String jabatan, String perusahaan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.perusahaan = perusahaan;
        System.out.println("Data berhasil diperbarui!");
    }
}