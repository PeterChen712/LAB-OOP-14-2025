public class Pelindung{
    String tubuh;
    String kepala;
    int defense;

    public Pelindung(String tubuh, String kepala, int defense){
        this.tubuh = tubuh;
        this.kepala = kepala;
        this.defense = defense;
    }
    public int getDef(){
        return defense;
        //return(int)(Math.random() * random);
    }
    public void setDef(int defense){
        this.defense = defense;
    }
}