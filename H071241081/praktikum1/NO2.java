import java.util.Scanner;

public class NO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Masukkan angka yang dicari :");
        int n = input.nextInt() ;
        
        int baris = 0 ;
        int kolom  = 0;
        boolean found = false ;

        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}} ;

        mark :
         for (int i = 0 ; i < nums.length ; i++){
            for (int j = 0 ; j < nums.length ; j++){
                if (nums[i][j] == n){
                    baris = i ;
                    kolom = j ;
                    found = true ;
                    break mark;

                }
            }
        }
        if (found ) {
        System.out.println("found " + n + " at" + "[" + baris + "]" +  " [" + kolom + "]" );
        
    }   else {
        System.err.println("NOT FOUND");

    }
}
}
