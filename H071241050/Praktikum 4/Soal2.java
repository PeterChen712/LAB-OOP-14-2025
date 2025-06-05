public class Soal2 {
    private String name;
    private double price;

    public Soal2(String name, double price) {
        this.name = name;
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        Soal2 p = new Soal2("Coffee Mug", 150000);
        
        p.setPrice(-50000); // Set harga negatif
        System.out.println("Harga sekarang: " + p.getPrice());
    }
}