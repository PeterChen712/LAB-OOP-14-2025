public class Counter {
    private static int count = 0;

    public static void tambah(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter.tambah();
        Counter.tambah();
        System.out.println(Counter.getCount());
    }
}


