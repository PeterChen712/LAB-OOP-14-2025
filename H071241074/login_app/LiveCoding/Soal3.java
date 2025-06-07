public class Soal3 {
    private String name;
    private double price;
    private double discountPercent;

    public double getDiscountPercent(double discountPercent) {
        if (discountPercent >= 0 && discountPercent <= 100) {
            return price * (100 - discountPercent) / 100;
        } else { 
            return price;
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
        this.price = price;
        if (price < 0 ) {
           this.price = 0;
        } else {
            this.price = price;
        }
    }

    public Soal3 (String name, double price){
        this.name = name;
        this.price = price;

        if (price < 0 ) {
            this.price = 0;
         } else {
             this.price = price;
         }
    }

    public static void main(String[] args) {
        Soal3 obj1 = new Soal3("Coffe Mug", 150000);

        
        System.out.println(obj1.getDiscountPercent(20));
    }
}

