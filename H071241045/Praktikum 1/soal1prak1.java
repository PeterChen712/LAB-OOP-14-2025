import java.util.Scanner;
public class Mingyu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul film: ");
        String judul = scanner.nextLine().trim();
        
        if (judul.isEmpty()) {
            System.out.println("Error: Input tidak boleh kosong!");
        } else {
            String hasil = KapitalSetiapKata(judul);
            System.out.println(hasil);
        }
        
        scanner.close();
    }
    
    public static String KapitalSetiapKata(String kalimat){
        String[] kata = kalimat.split(" ");
        String hasil = "";
        
        for(int i = 0; i < kata.length; i++){
            if(kata[i].length() > 0){
                hasil += kata[i].substring(0,1).toUpperCase() + kata[i].substring(1).toLowerCase() + " ";
            }
        }
        return hasil.trim();
    }
}
