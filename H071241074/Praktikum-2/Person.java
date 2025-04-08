import java.util.Scanner;
public class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return this.isMale ? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person orang = new Person();

        System.out.print("Masukkan nama: ");
        orang.setName(input.nextLine());

        System.out.print("Masukkan umur: ");
        orang.setAge(input.nextInt());

        System.out.print("Apakah laki-laki? (true/false): ");
        orang.setGender(input.nextBoolean());

        System.out.println("Namanya " + orang.getName() + " Berumur " + orang.getAge() + " Tahun" + " Berjenis kelamin " + orang.getGender());

        input.close();
        }
}
