import java.util.Scanner;
class nomor4 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();

        if (nums < 0) {
            System.out.println("Faktorial tidak ada");
        } else {
            System.out.println(factorial(nums));
        }
        input.close();
    }
    
}
