package Loops.Exercises;

public class ReverseTheDigits {
    public static void main(String[] args) {

        int num = 123;

        int reverse = 0;

        while (num != 0){

            int digits = num % 10;
            reverse = reverse * 10 + digits;
            num /= 10;
        }
        System.out.println("Reverse digits : " +reverse);

    }
}
