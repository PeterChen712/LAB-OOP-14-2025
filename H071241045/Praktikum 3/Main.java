
public class Main{
    public static void main(String[] args){

        Level levelA = new Level(2, 0.25);
        Level levelB = new Level(1, 0.1);

        Senjata PedangApi = new Senjata("Pedang Api", levelA, 40);
        Senjata TombakAngin = new Senjata("Tombak Angin", levelB, 35);

        Pelindung Armor1 = new Pelindung("Baju Baja", "Helm Baja", 7);
        Pelindung Armor2 = new Pelindung("Baju Kulit", "Helm Kayu", 5);

        Ksatria k1 = new Ksatria("Mingyu", 100, PedangApi, Armor1);
        Ksatria k2 = new Ksatria("Sunoo", 100, TombakAngin, Armor2);

        System.out.println("=== STATUS AWAL ===");
        k1.cekStatus();
        k2.cekStatus();

        k1.serang(k2);
        k2.serang(k1);
        k1.serang(k2);

        System.out.println("=== STATUS AKHIR ===");
        k1.cekStatus();
        k2.cekStatus();
       
    }
   
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Energi awal
//         int energiMingyu = 100;
//         int energiSunoo = 100;

//         System.out.println("=== STATUS AWAL ===");
//         System.out.println("Energi Mingyu: " + energiMingyu);
//         System.out.println("Energi Sunoo: " + energiSunoo);
//         System.out.println("===================");

//         System.out.print("Siapa yang menyerang? (1: Mingyu, 2: Sunoo): ");
//         int penyerang = input.nextInt();

//         System.out.print("Masukkan jumlah serangan: ");
//         int jumlahSerangan = input.nextInt();

//         System.out.print("Masukkan damage per serangan: ");
//         int damagePerSerangan = input.nextInt();

//         int totalDamage = jumlahSerangan * damagePerSerangan;

//         System.out.println("\n=== HASIL SERANGAN ===");

//         if (penyerang == 1) {
//             energiSunoo -= totalDamage;
//             if (energiSunoo < 0) energiSunoo = 0;
//             System.out.println("Mingyu menyerang Sunoo sebanyak " + jumlahSerangan + " kali dengan damage " + damagePerSerangan + " per serangan.");
//         } else if (penyerang == 2) {
//             energiMingyu -= totalDamage;
//             if (energiMingyu < 0) energiMingyu = 0;
//             System.out.println("Sunoo menyerang Mingyu sebanyak " + jumlahSerangan + " kali dengan damage " + damagePerSerangan + " per serangan.");
//         } else {
//             System.out.println("Pilihan penyerang tidak valid.");
//         }

//         System.out.println("\n=== STATUS AKHIR ===");
//         System.out.println("Energi Mingyu: " + energiMingyu);
//         System.out.println("Energi Sunoo: " + energiSunoo);

//         input.close();
//     }
// }
