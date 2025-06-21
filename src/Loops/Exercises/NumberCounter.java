package Loops.Exercises;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char chioce ;

        do {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();

            if (num > 0){
                positiveCount++;
            }
            else if(num < 0){
                negativeCount++;
            }
            else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number : (y/n) : ");
            chioce = sc.next().charAt(0);
        }while (chioce == 'y' || chioce == 'Y');

        System.out.println("Positive number : " +positiveCount);
        System.out.println("Negative number : " +negativeCount);
        System.out.println("Zero number : " +zeroCount);
    }
}
