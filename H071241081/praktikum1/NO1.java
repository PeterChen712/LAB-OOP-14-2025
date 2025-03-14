import java.util.Scanner;

public class NO1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Masukkan Judul FILM :");
        String sentenceB = input.nextLine();
        String sentence = sentenceB.toLowerCase() ;
        if ( sentence == null || sentence.isEmpty()){
            System.err.println( "string tidak boleh kosong");
        }
        
        
        String[] splitSentence = sentence.split(" ");

        String hasil = UbahHuruf(splitSentence) ;
        System.out.println(hasil);
        input.close();
    }
    public static String UbahHuruf(String[] Judul){
        StringBuilder hasil = new StringBuilder();

        for (String kata : Judul) {
            if (kata.length() > 0 ) {
                String kataKapital = kata.substring(0, 1).toUpperCase() + kata.substring(1);
                hasil.append(kataKapital).append(" ");
                
            }
        }
     return hasil.toString();
    }
}