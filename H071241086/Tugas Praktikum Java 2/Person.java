public class Person {
    String name;
    int age;
    boolean isMale;

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

    public String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
  
       Person person1 = new Person();
        

        person1.setName("Ahmad");
        person1.setAge(17);
        person1.setGender(true);

        System.out.println("Nama: " + person1.getName());
        System.out.println("Usia: " + person1.getAge());
        System.out.println("Jenis Kelamin: " + person1.getGender());
    }


}