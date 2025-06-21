package Loops.Exercises;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter  first  number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : " );
        int num2 = input.nextInt();

        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {

            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("Greatesr common divisor : " +gcd);





        while (num1 != num2){

            if (num1 > num2){
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }
        System.out.println(num1);





//        int num1 = 12;
//        int num2 = 8;
//
//        while (num2 != 0){
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//        System.out.println(num1);
    }
}
