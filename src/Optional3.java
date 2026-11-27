public class Optional3 {
    public static void main(String[] args){

        int[][] arr_A = {
                {2, 12, -8},
                {0, -24, 15}
        };
        int[][] arr_B = {
                {-13, 3, -11},
                {22, 37, 5}
        };
        int[][] arr_C = new int[2][3];

        for(int i=0; i<arr_C.length; i++){
            for(int j=0; j<arr_C[i].length; j++){
                arr_C[i][j] = arr_A[i][j] + arr_B[i][j];
            }
        }

        System.out.print("Array (C) = A + B: ");
        for(int i=0; i<arr_C.length; i++){
            System.out.println();

            for(int j=0; j<arr_C[i].length; j++){

                System.out.print(arr_C[i][j] + " ");
            }
        }


    }
}
