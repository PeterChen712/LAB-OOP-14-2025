public class personData {
    String name;
    int age;
    boolean isMale;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public String getGender(){
        return isMale ? "male" : "female";
    }

    

    public static void main(String[] args){
        personData objekData = new personData();
        objekData.setName("mingyu");
        objekData.setAge(27);
        objekData.setGender(true);
    

        System.out.println("name : " + objekData.getName());
        System.out.println("age : " + objekData.getAge());
        System.out.println("gender : " + objekData.getGender());
    }
        
}
