import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan judul film: ");
        System.out.print("> ");
        String input = scanner.nextLine();

        String result = capitalizeFirstLetter(input);

        System.out.println(result);
        scanner.close();
    }

    public static String capitalizeFirstLetter(String str) {
        String[] words = str.split("\\s+");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
            }
            else {
                System.out.println("Tidak ada kalimat yang dimasukkan.");
            }
        }

        return result.trim(); 
    }
}
