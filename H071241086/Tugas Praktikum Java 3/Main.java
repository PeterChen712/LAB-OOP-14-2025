public class Main {
    public static void main(String[] args) {
        KartuNama kartu1 = new KartuNama("Siti Nur Halisa", "Mahasiswa", "Universitas XYZ");
        PemilikKartu pemilik1 = new PemilikKartu("siti@email.com", "08123456789", kartu1);

        KartuNama kartu2 = new KartuNama("Diesty Mendila", "Backend Developer", "TechCorp");
        PemilikKartu pemilik2 = new PemilikKartu("diesty@email.com", "08987654321", kartu2);

        pemilik1.tampilkanSemuaInfo();
        pemilik2.tampilkanSemuaInfo();

        System.out.println("\nMemperbarui data kartu Siti...");
        kartu1.perbaruiInfo("Siti N. Halisa", "Frontend Developer", "Tech Startup");

        pemilik1.tampilkanSemuaInfo();

        System.out.println("\nMembandingkan email antara Siti dan Diesty:");
        pemilik1.bandingkanEmail(pemilik2); 
    }
}
