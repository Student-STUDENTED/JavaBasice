package Loops.Exercises;

public class SumOfDigits {
    public static void main(String[] args) {

        int num = 1234;

        int sum = 0;

        while (num != 0){

            int digits = num % 10;

            sum += digits;
            num /= 10;
        }
        System.out.println("Sum of digits : " +sum);
    }
}
