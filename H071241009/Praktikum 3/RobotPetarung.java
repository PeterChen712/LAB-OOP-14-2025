public class RobotPetarung {
    public String nama;
    public int energi;
    public Senjata senjata;
    public Perisai perisai;

    public RobotPetarung() {}

    public RobotPetarung(String nama, int energi, Senjata senjata, Perisai perisai) {
        this.nama = nama;
        this.energi = energi;
        this.senjata = senjata;
        this.perisai = perisai;
    }

    public void serang(RobotPetarung lawan) {
        System.out.println(nama + " menyerang " + lawan.nama + 
        " dengan " + senjata.jenis);
    
        double serangan = senjata.getSerangan("sensor");
        double damageSetelahPerisai = lawan.perisai.tahanSerangan(serangan);
    
        lawan.energi -= (double)damageSetelahPerisai;
        if (lawan.energi < 0) lawan.energi = 0;
    
        System.out.println(String.format("Damage yang diterima %s: %.2f", lawan.nama, damageSetelahPerisai));
        System.out.println();
    }
    
    
    public void status() {
        System.out.println("Robot: " + nama + ", Energi: " + energi);
    }
}
