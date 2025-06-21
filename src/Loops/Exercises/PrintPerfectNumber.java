package Loops.Exercises;

public class PrintPerfectNumber {

    public static void main(String[] args) {

        int num = 100000;

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int n = i;

            //for (int j = 1; j < n; j++) {

            for (int j = 1; j <= n/2; j++) {
                if (n % j == 0){

                    sum += j;
                }
            }

            //}
            if (sum == i){
                System.out.println(sum);
            }
        }
    }
}
