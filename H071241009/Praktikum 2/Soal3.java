class Cuboid{
    double height;
    double widht;
    double length;

    double getVolume(){
        return height * widht * length;
    }

    double getArea(){
        return 2 * (height * widht + height * length + widht * length);
    }
}

public class Soal3{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.widht = 15;
        cuboid.length = 30;

        System.out.println(String.format("Volume = %2.2f", cuboid.getVolume()));
        System.out.println(String.format("Area = %2.2f ", cuboid.getArea()));
    }
}

