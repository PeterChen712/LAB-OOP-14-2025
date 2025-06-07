public class Senjata{
    String namaSenjata;
    Level level;
    int damage;

    public Senjata(String namaSenjata, Level level, int damage){
        this.namaSenjata = namaSenjata;
        this.level = level;
        this.damage = damage;
    }

    public double getDamage(){
        return damage + (damage * level.bonus);
    }
}
