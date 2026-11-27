public class Optional1 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 33, 12, 8},
                {37, 24, 5, 7},
                {4, 62, 13, 28}
        };
        int[] maxArray = new int[3];

        for(int i=0; i<array.length; i++){

            for(int j=0; j<array[i].length; j++) {

                maxArray[i] += array[i][j];
            }
        }
        int max = maxArray[0];

        for(int i=0; i<maxArray.length; i++){
            System.out.println(i + ": " + maxArray[i]);
            if(max < maxArray[i]){
                max = maxArray[i];
            }
        }
        System.out.println("Max: " + max);


    }
}
