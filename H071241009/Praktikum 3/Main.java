public class Main {
    public static void main(String[] args) {
        // Ukuran ukuran1 = new Ukuran(120, 15.0);
        // Senjata senjata1 = new Senjata("Laser", ukuran1, 50);
        // Perisai perisai1 = new Perisai("Titanium", "Sensor");

        // RobotPetarung robot1 = new RobotPetarung("RX-78", 120, senjata1, perisai1);

        // Ukuran ukuran2 = new Ukuran(80, 12.5);
        // Senjata senjata2 = new Senjata("Plasma", ukuran2, 45);
        // Perisai perisai2 = new Perisai("Carbon Fiber", "Sensor");

        // RobotPetarung robot2 = new RobotPetarung("Zaku", 110, senjata2, perisai2);

        // robot1.serang(robot2);
        // robot2.serang(robot1);

        // System.out.println("Status: ");
        // robot1.status();
        // robot2.status();

        // ArenaPertarungan.tentukanPemenang(robot1, robot2);

        Ukuran ukuran1 = new Ukuran(90, 10.0); 
        Senjata senjata1 = new Senjata("Beam Saber", ukuran1, 40); 
        Perisai perisai1 = new Perisai("Titanium", "Sensor");
        RobotPetarung robot1 = new RobotPetarung("Gundam", 100, senjata1, perisai1);
 
        Ukuran ukuran2 = new Ukuran(90, 10.0); 
        Senjata senjata2 = new Senjata("Heat Rod", ukuran2, 40);
        Perisai perisai2 = new Perisai("Titanium", "Sensor");
        RobotPetarung robot2 = new RobotPetarung("Dom", 100, senjata2, perisai2);
 
        robot1.serang(robot2);
        robot2.serang(robot1);
 
        System.out.println("Status: ");
        robot1.status();
        robot2.status();
 
        ArenaPertarungan.tentukanPemenang(robot1, robot2);
    }
}
