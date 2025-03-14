import java.util.Scanner;

public class NO4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("MASUKKAN NILAI N :");
        int n = input.nextInt () ;
        int hasil = 1;
        for (int i = n ; i>=1 ;i--) {
             
        hasil *= i ;

        
    }
    System.out.println(hasil);
}
}