package Loops.Exercises;

import java.util.Scanner;

public class DispalySmallestAndLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice ;

        do {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();

            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }

            System.out.print("Do you want to enter number (y/n) : ");
            choice = sc.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number : " +max);
        System.out.println("Smallest number : " +min);

        sc.close();
    }
}
