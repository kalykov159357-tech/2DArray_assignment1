public class Task11 {
    public static void main(String[] args){

        int[][] array = {
                {-23, -12, 0},
                {1, 8, 15},
                {-18, -5, -4}
        };

        System.out.print("Original: ");
        for(int i=0; i<array.length; i++){
            System.out.println();
            for(int j=0; j<array[i].length; j++){

                System.out.print(array[i][j] + " ");
            }
        }

        System.out.print("\n\nModified: ");
        for(int i=0; i<array.length; i++){
            System.out.println();
            for(int j=0; j<array[i].length; j++){

                if(array[i][j] < 0){
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
        }

    }
}
