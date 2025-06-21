package Loops.Exercises;


import java.util.Scanner;

public class CheckStringPalindrome {

    public static void main(String[] args) {

        System.out.print("Enter the string : ");
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String  reverse = "";

//        for (int i = str.length()-1; i >= 0; i--) {
//
//            reverse = reverse+ str.charAt(i);
//        }

        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }

        if (str.equals(reverse)){

            System.out.println(reverse +" is palindrome ");
        }else {
            System.out.println(reverse + " is not palindrome");
        }

    }
}
