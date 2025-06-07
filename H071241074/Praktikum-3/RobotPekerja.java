public class RobotPekerja {
    String nama;
    int koutaUang;
    Barang barangPegangan;

    public RobotPekerja() {
        this.nama = "Robot Pekerja";
        this.koutaUang = 0;
        this.barangPegangan = new Barang();
    }

    public RobotPekerja(String nama, int KoutaUang, Barang barangPegangan) {
        this.nama = nama;
        this.koutaUang = KoutaUang;
        this.barangPegangan = barangPegangan;  
    }

    public void ambilBarang(Barang item) {
        this.barangPegangan = item;
        this.koutaUang += item.nilai;
        System.out.println(nama + " telah mengambil barang " + item.namaBarang + " dengan nilai " + item.nilai);
    }


    public void aduRobot(RobotPekerja musuh) {
        if (this.koutaUang > musuh.koutaUang) {
            System.out.println(nama + " menang dari " + musuh.nama);
        } else if (this.koutaUang < musuh.koutaUang) {
            System.out.println(musuh.nama + " menang dari " + nama);
        } else {
            System.out.println("Permainan seri");
        }
        
    }
}
