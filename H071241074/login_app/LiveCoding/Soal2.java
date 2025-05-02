public class Soal2 {
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
        } else {
            this.price = price;
        }
    }

    public Soal2 (String name, double price){
        this.name = name;
        this.price = price;

        if (price < 0 ) {
            this.price = 0;
         } else {
             this.price = price;
         }
    }

    public static void main(String[] args) {
        Soal2 obj1 = new Soal2("Coffe Mug", 150000);

        obj1.setPrice(-50000);
        System.out.println(obj1.getPrice());
    }
}

