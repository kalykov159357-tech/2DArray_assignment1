public class Task10 {
    public static void main(String[] args){

        int[][] array = {
                {23, 12, 0},
                {1, 8, 15},
                {18, 5, 4}
        };
        int sum = 0;

        for(int i=0; i<array.length; i++){
            sum += array[i][i];
        }

        System.out.println("Sum of main diagonal: " + sum);
    }
}
