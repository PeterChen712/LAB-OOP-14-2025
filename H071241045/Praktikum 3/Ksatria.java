public class Ksatria{
    String nama;
    int energi;
    Senjata senjata;
    Pelindung armor;

    // public Ksatria(){
    //     this.nama = "Ksatria Tanpa Nama";
    //     this.energi = 100;
    //     this.senjata = new Senjata("Default Sword", new Level(1, 0.1), 20);
    //     this.armor = new Pelindung("Kulit Naga", "Helm Baja");
    // }
    public Ksatria(String nama, int energi, Senjata senjata, Pelindung armor){
        this.nama = nama;
        this.energi = energi;
        this.senjata = senjata;
        this.armor = armor;
    }
    public void serang(Ksatria musuh){
        System.out.println(nama + " menyerang " + musuh.nama + " dengan " + senjata.namaSenjata);
            
        double totalDamage = senjata.getDamage();
        int def = musuh.armor.getDef();
        int hit = (int) (totalDamage - def);
        if (hit < 0) hit = 0;

        musuh.energi -= hit;
        if(musuh.energi < 0) musuh.energi = 0;

        System.out.println("Serangan kena sebesar " + hit + " (defense: " + def + ")");
        System.out.println("Energi " + musuh.nama + " tersisa: " + musuh.energi);
        System.out.println();      
    }
    public void cekStatus(){
        System.out.println("Ksatria: " + nama);
        System.out.println("Energi: " + energi);
        System.out.println("Senjata: " + senjata.namaSenjata + "(Damage: " + senjata.damage + ")");
        System.out.println("Pelindung: " + armor.tubuh + ", " + armor.kepala);
        System.out.println("-----------------------------------");
    }
}
