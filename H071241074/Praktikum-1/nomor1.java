import java.util.Scanner;

class nomor1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String judul = input.nextLine();

        String[] words = judul.split(" ");
        String hasil = "";

        for (String word : words) {
            hasil += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }

        System.out.println(hasil);

        input.close();
    }
}