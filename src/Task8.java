import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] array = {
                {23, -12, 0, 13},
                {-1, -8, 15, 9},
                {18, 5, 29, 31}
        };
        int count = 0;

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int i=0; i<array.length; i++){

            for(int j=0; j<array[i].length; j++){

                if(num > array[i][j]){
                    count++;
                }
            }
        }

        System.out.println("Number of array elements that are greater than the entered number: " + count);


    }
}
