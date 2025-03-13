import java.util.Scanner;

public class NO5 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in) ;
        System.out.print("MASUKKAN PASSWORD :") ;
        String pw = input.nextLine() ;

        
        

        if (cekValid(pw)) {
            System.out.println("Input Valid");
        } else {
            System.out.println("Input Tidak Valid");
        }

        
    }

        public static boolean cekValid (String pw) {
        boolean adaHurufBesar = false;
        boolean adaHurufKecil = false;
        boolean adaAngka = false;
        boolean kkarakter = false ;

        if (pw.length() < 8) {
           return false ;
        }

        for (char karakter : pw.toCharArray()) {
            if (Character.isUpperCase(karakter)) {
                adaHurufBesar = true;
            } else if (Character.isLowerCase(karakter)) {
                adaHurufKecil = true;
            } else if (Character.isDigit(karakter)) {
                adaAngka = true;
            }
            if (adaHurufBesar && adaHurufKecil && adaAngka && kkarakter ) {
                break ;

            }
        }
        return adaHurufBesar && adaHurufKecil && adaAngka && kkarakter;


        }
    }

    

