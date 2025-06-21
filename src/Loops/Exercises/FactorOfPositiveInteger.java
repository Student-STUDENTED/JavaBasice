package Loops.Exercises;

import java.util.Scanner;

public class FactorOfPositiveInteger {

    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num <= 0){
            System.out.println("Please enter positive integer");
            return;
        }

        for (int i = 1; i <= num; i++) {

            if (num % i == 0){

                System.out.println(i);
            }
        }
    }
}
