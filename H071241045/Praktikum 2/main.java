class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume(){
        return height * widht * length;
    }
    
}

public class main{
public static void main(String[] args) {
    Cuboid cuboid = new Cuboid();
    
    cuboid.length = 10;
    cuboid.widht = 15;
    cuboid.height = 30;

    System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}