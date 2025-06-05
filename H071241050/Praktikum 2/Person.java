import java.util.Scanner;

public class Person { 
    private String name; //atribut ini hanya bisa diakses di dalam class itu sendiri
    private int age;
    private boolean isMale;

    public void setName(String name) { //method mengatur nilai variabel name
        this.name = name; // atribut name di dalam objek diisi dengan nilai dari parameter name yang diberikan.
    }

    public void setAge(int age) { //mengatur umur berdasarkan parameter age
        this.age = age;
    }

    public void setGender(String genderInput) { //Method setGender: menerima input string (laki-laki atau perempuan)
        this.isMale = genderInput.equalsIgnoreCase("laki-laki"); //membandingkan string 
    }

    public String getName() { //Getter untuk mengambil nilai dari atribut name.
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return this.isMale ? "laki-laki" : "perempuan"; // cara singkat untuk menulis if-else
    }

    public static void main(String[] args) { //method utama di java
        Scanner input = new Scanner(System.in); //objek Scanner bernama input
        
        System.out.print("Masukkan nama: ");
        String name = input.nextLine(); // nextline penting kalau kita ingin membaca kalimat lengkap atau input dengan spasi
        
        System.out.print("Masukkan umur: ");
        int age = Integer.parseInt(input.nextLine()); //mengubah string menjadi integer
        
        System.out.print("Masukkan gender (laki-laki/perempuan): ");
        String isMale = input.nextLine(); //Membaca input jenis kelamin dan menyimpannya ke variabel isMale
    
        Person p = new Person(); //Membuat objek baru dari class Person
        p.setName(name); //Mengisi data objek p menggunakan input yang sudah diterima dari user
        p.setAge(age);
        p.setGender(isMale);
    
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Gender: " + p.getGender());
    }
}
