public class Person {
    private String name;
    private int age;
    private boolean isMale;

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

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Ahmad");
        person1.setAge(17);
        person1.setGender(true);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

        if (Person.getGender()) {
            System.out.println("Laki-laki");
        } else {
            System.out.println("Perempuan");
        }
           
        
    }
}