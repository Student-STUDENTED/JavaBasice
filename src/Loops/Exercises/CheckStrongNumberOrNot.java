package Loops.Exercises;

public class CheckStrongNumberOrNot {

    public static void main(String[] args) {


        int num = 145;
        int original = num;
        int sum = 0;

        while (num != 0){
            int digits = num % 10;

            int factorial = 1;
            for (int i = 1; i <= digits; i++) {

                factorial *= i;
            }
            sum += factorial;

            num /= 10;

        }
        System.out.println(sum);

        if (sum == original){
            System.out.println(original + " is a strong number");
        }else {
            System.out.println(original + " is not strong number" );
        }
    }
}
