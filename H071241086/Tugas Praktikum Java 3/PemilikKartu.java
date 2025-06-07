public class PemilikKartu {
    String email;
    String nomorTelepon; 
    KartuNama kartu;     

    public PemilikKartu() {
        this.email = "email@domain.com";
        this.nomorTelepon = "0000000000";
        this.kartu = new KartuNama();
    }

    
    public PemilikKartu(String email, String nomorTelepon, KartuNama kartu) {
        this.email = email;
        this.nomorTelepon = nomorTelepon;
        this.kartu = kartu;
    }

    public void tampilkanSemuaInfo() {
        kartu.tampilkanKartu(); 
        System.out.println("Email       : " + email);
        System.out.println("No. Telepon : " + nomorTelepon);
        System.out.println("==============================");
    }

    public void bandingkanEmail(PemilikKartu lain) {
        if (this.email.equalsIgnoreCase(lain.email)) {
            System.out.println("Email " + this.email + " dan " + lain.email + " adalah sama.");
        } else {
            System.out.println("Email " + this.email + " dan " + lain.email + " berbeda.");
        }
    }
}
