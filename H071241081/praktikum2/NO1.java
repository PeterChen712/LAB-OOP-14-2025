package TP2;


class mahasiswa {
    int age ;
    String nama ;
    boolean isMale ;


public int getAge() {
    return age;
}
public String getNama() {
    return nama;
}
public boolean isMale() {
    return isMale;
}

public void setAge(int age) {
    this.age = age;
}

public void setNama(String nama) {
    this.nama = nama;
}
public void setGender(boolean isMale) {
    this.isMale = isMale;
}


}


public class NO1{
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa() ;
        mahasiswa1.setAge(19);
        mahasiswa1.setGender(true);
        mahasiswa1.setNama("Ahmad Hidayat" ) ;

        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("Umur: " + mahasiswa1.getAge());
        System.out.println("Jenis Kelamin: " + (mahasiswa1.isMale() ? "Laki-laki" : "Perempuan"));

    }
}
