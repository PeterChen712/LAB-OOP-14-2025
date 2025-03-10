import java.util.Scanner;
public class soal2prak1 {
    public static void main(String[] args){
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);
    
        try{
            System.out.print("masukkan angka yang ingin cari: ");
            int target = scanner.nextInt();

            boolean found = false;
            mark:
            for(int i = 0; i < nums.length; i++){
                for(int j = 0; j < nums.length; j++){
                    if(nums[i][j] == target){
                        System.out.println("found " + target + " at [" + i + "][" + j +"]");    
                        found = true;
                        break mark;
                    }
                }
                // if (found) break;
            }
            if (!found) {
                System.out.println("angka tidak ditemukan dalam array");
            }

        }catch (Exception e) {
            System.out.println("input tidak valid! harap masukkan angka");
        }finally{
            scanner.close();
        }
    }
}
