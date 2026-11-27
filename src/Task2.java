public class Task2 {
    public static void main(String[] args){

        int [][] array = {
                {5, 10, 15},
                {20, 25, 30},
        };

        System.out.print("Original:");
        for(int i=0; i<array.length; i++) {
            System.out.println();

            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }

        System.out.println("\n\nArray[1][2]: " + array[1][2]);
        array[0][1] = 99;

        System.out.print("\nChanged:");
        for(int i=0; i<array.length; i++) {
            System.out.println();

            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }

    }
}
