package TP2 ;

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
        return height * length * width ;
        // Lengkapi
    }
}

public class NO3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.setHeight(30);
        cuboid.setLength(30);
        cuboid.setWidth(50);
        cuboid.getVolume() ;
        System.out.printf("Volume = %.2f%n", cuboid.getVolume());
    }
}
