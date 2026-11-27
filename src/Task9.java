import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] array = {
                {11, 8, 0},
                {-1, 11, 4}
        };
        boolean find = false;

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int i=0; i<array.length; i++){

            for(int j=0; j<array[i].length; j++){

                if(num == array[i][j] && !find){
                    System.out.println("The element has found: " + num);
                    System.out.println("The element's row and column: [" + i + "][" + j + "]");
                    find = true;
                }
            }
        }
        if(!find){
            System.out.println("The element has not found");
        }
    }
}
