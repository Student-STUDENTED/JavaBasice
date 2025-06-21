package Loops.Exercises;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {


        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // start dividing from smallest prime number 2.
        for (int i = 2; i < num; i++) {
            // if i divided num
            while (num % i == 0){
                System.out.print(i + " ");
                num /= i;
            }
        }

        // if num is prime number greater than 2
        if (num > 2){
            System.out.println(num);
        }
    }
}
