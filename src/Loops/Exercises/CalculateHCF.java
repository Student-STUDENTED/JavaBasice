package Loops.Exercises;

import java.util.Scanner;

public class CalculateHCF {

    public static void main(String[] args) {

        System.out.print("Enter the first number : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        // 8, 12

        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("HCF is " +num1);

    }
}
