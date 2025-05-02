public class Toko {
    private String name;
    private double price;

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
        } else if {
            this.price = price;
        }
    }

    public Toko (String name, double price){
        this.name = name;
        this.price = price;

        if (price < 0 ) {
            this.price = 0;
         } else if {
             this.price = price;
         }
    }
}
