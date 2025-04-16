public class Senjata {
    public String jenis;
    public Ukuran ukuran;
    public double kekuatanSerang;

    public Senjata() {}

    public Senjata(String jenis, Ukuran ukuran, double kekuatanSerang) {
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.kekuatanSerang = kekuatanSerang;
    }

    public double getSerangan(String target) {
        double base = kekuatanSerang;
    
        base += ukuran.berat * 0.5;
    
        if (target.equalsIgnoreCase("sensor")) {
            base *= 1.4;
        }
    
        double akurasi = 1.0;
        if (ukuran.panjang > 100) {
            akurasi -= 0.1; 
        } else if (ukuran.panjang < 50) {
            akurasi += 0.1; 
        }
    
        double totalSerangan = base * akurasi;
    
        System.out.println("Berat Senjata: " + ukuran.berat +
            ", Panjang Senjata: " + ukuran.panjang + ", Total Damage: " + totalSerangan);
    
        return totalSerangan;
    }
    
}