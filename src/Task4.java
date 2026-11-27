public class Task4 {
    public static void main(String[] args){

        int [][] array = {
                {11, 7, 10},
                {2, 15, 18},
                {9, 4, 13}
        };
        int even = 0, odd = 0;

        for(int i=0; i<array.length; i++) {
            System.out.println();

            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");

                if(array[i][j] % 2 == 0){
                    even ++;
                }else{
                    odd++;
                }
            }
        }

        System.out.println("\n\nCount of even numbers: " + even);
        System.out.println("Count of odd numbers: " + odd);
    }
}
