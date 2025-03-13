import java.util.Scanner;

public class NO3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Masukkan tanggal :");
        String waktu= input.nextLine();

        String[] hasilSplit = waktu.split ("-") ;

        String [] nama_bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
             "Juli", "Agustus", "September", "Oktober", "November",
             "December" 
        } ;

        
        int tanggal = Integer.parseInt(hasilSplit[0]) ;
        int bulan = Integer.parseInt(hasilSplit[1]) ;
        int tahun= Integer.parseInt(hasilSplit[2]) ;

        
        if (tanggal< 1 || tanggal > 31) {
            System.err.println("Tanggal tidak valid!");
            return;
        }

        if (tahun > 50) { 
            tahun += 1900;
        } else {
            tahun += 2000;
        }

        if (bulan < 1 || bulan > 12){
            System.err.println("bulan tidak valid!");
            return;
        }

        System.out.println( tanggal + " " + nama_bulan [bulan - 1] + " " + tahun ) ;

        input.close();

    }
}
