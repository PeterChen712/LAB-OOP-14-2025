import java.util.Scanner;

class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("Masukkan angka: ");
        
        if (input.hasNextInt()) {
            int target = input.nextInt();
            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        found = true;
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        break;
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println(target + " not found.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        input.close();
    }
}
