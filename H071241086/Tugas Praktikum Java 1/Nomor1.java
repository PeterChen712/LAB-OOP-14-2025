import java.util.Scanner; 

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        

        String[] words = input.split(" ");
        String result = "";
        
        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
        }
        
        System.out.println(result.trim());
        scanner.close();
    }
}