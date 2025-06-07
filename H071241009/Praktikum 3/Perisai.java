public class Perisai {
    public String bahan;
    public String bagianDilindungi;

    public Perisai() {}

    public Perisai(String bahan, String bagianDilindungi) {
        this.bahan = bahan;
        this.bagianDilindungi = bagianDilindungi;
    }

    public int getPertahanan() {
        return 10; 
    }

    public double tahanSerangan(double seranganMasuk) {
        double pertahanan = getPertahanan();  
        double hasil = seranganMasuk - pertahanan;

        if (hasil < 0) hasil = 0;

        System.out.println("Perisai " + bahan + " melindungi bagian " + bagianDilindungi +
            " dan menyerap " + pertahanan + " damage.");

        return hasil;
    }
}
