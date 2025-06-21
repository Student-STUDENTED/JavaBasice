package Loops.Exercises;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        int n = 20;
        int sum = 0;

        for (int i = 0; i <= n; i++) {

            if (i % 2 != 0){

                sum += i;

            }
        }
        System.out.println("Sum of odd numbers : " + sum);
    }
}
