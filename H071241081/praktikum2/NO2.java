package TP2;
class Toko {
    String id ;
    String nama ;
    int stok ;
    int harga ;

    public void getDetail(String id, String nama, int stok, int harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    
    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public int getStok() {
        return stok;
    }
    public int getHarga() {
        return harga;
    }
    


}


public class NO2 {
    Toko toko = new Toko();
}
