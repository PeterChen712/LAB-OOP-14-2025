public class Soal1 {
    // Properti private
    private String name;
    private double price;

    // Constructor
    public Soal1(String name, double price) {
        this.name = name;
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    // Getter dan Setter
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
}