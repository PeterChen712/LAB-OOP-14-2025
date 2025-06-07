public class Soal3 {
    private String name;
    private double price;

    public Soal3(String name, double price) {
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
     Soal3 p = new Soal3("Coffee Mug", 150000);
        
        System.out.println("Harga sekarang: " + p.getDiscountedPrice(20));
    }
    
    //Method
    public double getDiscountedPrice(double discountpersent) {
        if( discountpersent > 0 && discountpersent <= 100) {
            return price * (100 - discountpersent)/100;
        }
        else{
            return price;
        }
    }
}