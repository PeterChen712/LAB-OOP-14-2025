// Class Item sebagai atribut objek
public class Item {
    String name;
    int bonusAttack;

    public Item() {
        this.name = "Tanpa Item";
        this.bonusAttack = 0;
    }

    public Item(String name, int bonusAttack) {
        this.name = name;
        this.bonusAttack = bonusAttack;
    }

    public int getBonusAttack() {
        return bonusAttack;
    }

    public String getName() {
        return name;
    }
}
