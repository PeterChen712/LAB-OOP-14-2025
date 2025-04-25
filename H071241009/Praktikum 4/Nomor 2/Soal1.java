public class Soal1{
    // Properti Private
    private String name;

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Properti Private
    private double price;

    // Getter and Setter
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0){
            this.price = 0;
        }
        else{
            this.price = price;
        }
    }

    // Constructor
    public Soal1(String name, double price){
        this.name = name;
        if (price < 0){
            this.price = 0;
        }
        else{
            this.price = price;
        }
    }

}