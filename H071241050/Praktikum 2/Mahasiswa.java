
//CARA CONTRUCTOR
public class Mahasiswa{
    String nama;

    public Mahasiswa(String nama){
        this.nama = nama;
    }
    

    public static void main(String[] args){
        Mahasiswa obj = new Mahasiswa("rudy");

        System.out.println(obj.nama);
    }
}


//CARA SETTER 

// public class Mahasiswa{
//     String nama;

//     public Mahasiswa(String nama){
//         this.nama = nama;
//     }

//     public Mahasiswa(){

//     };


//     public void setNama(String nama){
//         this.nama = nama;
//     }

//     public static void main(String[] args){
//         Mahasiswa obj = new Mahasiswa();

//         obj.setNama("rudy");

//         System.out.println(obj.nama);
//     }
// }