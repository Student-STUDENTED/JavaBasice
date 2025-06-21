package Loops.Exercises;

public class PrintArmstrongNumber {

    public static void main(String[] args) {

        int n = 100000;


        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;
            int countdigit = 0;

            while (num > 0){
                int digit = num % 10;
                countdigit++;

                num /= 10;
            }

            num = i;
            while (num > 0){
                int digits = num % 10;

                int power = 1;
                for (int j = 0; j < countdigit; j++) {
                    power *= digits;
                }
                sum += power;
                num /= 10;
            }

            if (sum == i){
                System.out.println(sum);
            }


        }









        // only works for 3 digits Armstrong number.
       // int n = 999;
//        for (int i = 1; i <= n; i++) {
//            int sum = 0;
//            int num = i;
//
//            while (num > 0){
//                int d = num % 10;
//                sum = sum + (d * d * d);
//
//                num /= 10;
//            }
//            if (sum == i){
//                System.out.println(sum);
//            }
//        }
    }
}
