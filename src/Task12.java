public class Task12 {
    public static void main(String[] args){

        int[][] grades = {
                {1, 3, 2, 8},
                {3, 2, 5, 7},
                {4, 6, 3, 8}
        };
        int max = grades[0][0];
        int all_sum = 0, count = 0;

        for(int i=0; i<grades.length; i++){
            double average = 0.0;
            int sum = 0;

            for(int j=0; j<grades[i].length; j++){

                sum += grades[i][j];
                average = (double) sum / 4;

                if(grades[i][j] > max){
                    max = grades[i][j];
                }

                all_sum += grades[i][j];
                count++;

            }
            System.out.println("Average score for " + (i+1) + " student: " + average);
        }

        double all_average = (double) all_sum / count;

        System.out.println("Class maximum score: " + max);
        System.out.println("Overall average score: " + all_average);

    }
}
