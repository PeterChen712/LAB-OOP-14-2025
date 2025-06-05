public class HeroML {
    String name;
    int basicAttack;
    Item equippedItem; // atribut objek dari class Item

    public HeroML() {
        this.name = "Unknown Hero";
        this.basicAttack = 0;
        this.equippedItem = new Item();
    }

    public HeroML(String name, int basicAttack, Item equippedItem) {
        this.name = name;
        this.basicAttack = basicAttack;
        this.equippedItem = equippedItem;
    }

    // Method untuk menghitung total attack power
    public int getTotalAttack() {
        return basicAttack + equippedItem.getBonusAttack();
    }

    // Interaksi antar objek HeroML
    public void attack(HeroML enemy) {
        System.out.println(this.name + " menyerang " + enemy.name + " dengan kekuatan " + getTotalAttack());
        // Misalnya kita hanya tampilkan serangan, tidak ada pengurangan HP biar simpel
    }

    // Method tambahan
    public void showInfo() {
        System.out.println("Hero: " + name);
        System.out.println("Basic Attack: " + basicAttack);
        System.out.println("Item: " + equippedItem.getName() + " (+"
                           + equippedItem.getBonusAttack() + " Attack)");
    }
}
