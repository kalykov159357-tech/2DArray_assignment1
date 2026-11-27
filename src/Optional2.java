public class Optional2 {
    public static void main(String[] args){

        int[][] array_2 = {
                {1, 3, 5},
                {10, 8, 5}
        };

        int[][] T_array = new int[3][2];

        System.out.print("Original:");
        for (int i = 0; i < array_2.length; i++) {
            System.out.println();

            for (int j = 0; j < array_2[i].length; j++) {
                System.out.print(array_2[i][j] + " ");
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                T_array[j][i] = array_2[i][j];
            }
        }

        System.out.print("\nTranspose:");
        for (int i = 0; i < 3; i++) {
            System.out.println();

            for (int j = 0; j < 2; j++) {
                System.out.print(T_array[i][j] + " ");
            }

        }
    }
}
