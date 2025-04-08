class Cuboid {
    double height;
    double width;
    double length;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getVolume() {
        return height * width * length;
    }

    double getArea() {
        return 2 * (height * width) + 
        2 * (height * length) +
        2 * (width * height);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Cuboid balok = new Cuboid();
        balok.setHeight(2); 
        balok.setWidth(2);
        balok.setLength(2);

        System.out.println(String.format("Volume: %.2f", balok.getVolume()));
        System.out.println(String.format("Permukaan: %.2f", balok.getArea()));
    
    }

    
}
