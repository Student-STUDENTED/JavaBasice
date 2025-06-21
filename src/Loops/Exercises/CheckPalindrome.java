package Loops.Exercises;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reverse = 0;

        int t = num;
        while (num != 0){

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num /= 10;
        }

        if (t == reverse) {
            System.out.println(reverse +"  Palindrome number");
        }
        else {
            System.out.println(reverse + " is not palindrome number");
        }

    }
}
