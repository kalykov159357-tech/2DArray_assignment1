public class Task3 {
    public static void main(String[] args){

        int[][] array = {
                {3, 1, 1},
                {1, 3, 1},
                {1, 1, 3}
        };

        int sum = 0;

        for(int i=0; i<array.length; i++) {
            System.out.println();

            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
        }

        System.out.println("\n\nSum: " + sum);
    }
}
