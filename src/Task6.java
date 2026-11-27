import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int[][] array = new int[2][3];

        System.out.println("Enter the elements in the 2D array: ");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){

                System.out.print("Array[" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }

        System.out.print("\nArray: ");
        for(int i=0; i<array.length; i++){
            System.out.println();
            for(int j=0; j<array[i].length; j++){

                System.out.print(array[i][j] + " ");
            }
        }


    }
}
