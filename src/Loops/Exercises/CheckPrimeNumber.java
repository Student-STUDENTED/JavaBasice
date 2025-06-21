package Loops.Exercises;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean prime = true;
        if (num == 0 || num == 1){
            prime = false;
        }
        else {

            for (int i = 2; i <= num/2; i++) {

                if (num % i == 0){
                    prime = false;
                    break;
                }

            }
        }
        if (prime){
            System.out.println(num + " is prime number");
        }
        else {
            System.out.println(num + " is not prime number");
        }
    }
}
