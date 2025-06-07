public class ArenaPertarungan {

    public static void tentukanPemenang(RobotPetarung r1, RobotPetarung r2) {
        System.out.println("\n=== HASIL PERTARUNGAN ===");
        if (r1.energi > r2.energi) {
            System.out.println(r1.nama + " menang!");
        } else if (r2.energi > r1.energi) {
            System.out.println(r2.nama + " menang!");
        } else {
            System.out.println("Pertarungan berakhir seri!");
        }
    }
}

