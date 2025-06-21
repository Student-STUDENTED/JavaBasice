package Loops.Exercises;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

       int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0){
                System.out.println("Largest common multiply : " +lcm);
                break;
            }
            lcm++;
        }

    }
}
