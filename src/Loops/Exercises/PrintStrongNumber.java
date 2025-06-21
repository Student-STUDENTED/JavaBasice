package Loops.Exercises;

public class PrintStrongNumber {
    public static void main(String[] args) {

        int n  = 100000;

        for (int i = 1; i <= n; i++) {
           int num = i;
            int sum = 0;

            while (num != 0){
                int digit = num % 10;

                int fact = 1;

                for (int j = 1; j <= digit ; j++) {

                    fact *= j;
                }
                sum += fact;
                num /= 10;
            }
            if (sum == i){
                System.out.println(sum);
            }
        }
    }
}
