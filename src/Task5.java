public class Task5 {
    public static void main(String[] args){

        int[][] array = {
                {52, -8, 36, 8},
                {-1, 13, 83, 12},
                {19, 3, -17, 20}
        };

        int max = array[0][0];
        int min = array[0][0];

        for(int i=0; i<array.length; i++) {
            System.out.println();

            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");

                if(array[i][j] > max){
                    max = array[i][j];
                }
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
        }

        System.out.println("\n\nLargest: " + max);
        System.out.println("Smallest: " + min);
    }
}
