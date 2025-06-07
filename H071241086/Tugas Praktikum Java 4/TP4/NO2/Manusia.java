class Manusia {
    String nama;

    void bernafas () {
        System.out.println("ini manusia");
    }

    void makan () {
        System.out.println("makan");
    }
    
    
}

class  Mahasiswa  extends Manusia {

    @Override
    void bernafas () {
        System.out.println("Mahasiswa");
    }
    public static void main(String[] args) {
        // Mahasiswa mahasiswa = new Mahasiswa();
        // mahasiswa.bernafas();

        // Manusia obj = new Mahasiswa();
        // obj.bernafas();
    }

    
}
