public class Soal1 {
    public String name;
    public int age;
    public boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean getGender() {
        return isMale;
    }

    public String checkGender(boolean isMale){
        if (isMale){
            return "Male";
        }
        else{
            return "Female";
        }
    }

    public static void main(String[] args) {
        Soal1 person = new Soal1();
        Soal1 orang = new Soal1();

        orang.setName("Mahesa");
        orang.setAge(19);
        orang.setGender(false);

        System.out.println("Nama   : " + orang.getName());
        System.out.println("Usia   : " + orang.getAge());
        System.out.println("Gender : " + orang.checkGender(false));

        person.setName("Person");
        person.setAge(19);
        person.setGender(true); 

        System.out.println("\nNama   : " + person.getName());
        System.out.println("Usia   : " + person.getAge());
        System.out.println("Gender : " + person.checkGender(true));

    }
}
