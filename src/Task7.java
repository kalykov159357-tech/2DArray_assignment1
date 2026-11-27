public class Task7 {
    public static void main(String[] args){

        int[][] array = {
                {2, 15, 9},
                {10, 3, 8},
                {6, 21, 11}
        };

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i < array.length; i++) {

            int sum = 0;

            for (int j=0; j < array[i].length; j++) {
                sum += array[j][i];
            }

            System.out.println("Column " + (i + 1) + " sum: " + sum);
        }
    }
}
