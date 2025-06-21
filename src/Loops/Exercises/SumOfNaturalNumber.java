package Loops.Exercises;

public class SumOfNaturalNumber {

    public static void main(String[] args) {

        int n = 10;

        int sum = 0;

        for (int i = 0; i <= n; i++) {

            sum += i;

        }
        System.out.print("Sum of Natural Numbers : " +sum);
    }
}
