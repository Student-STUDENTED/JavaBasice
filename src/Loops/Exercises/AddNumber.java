package Loops.Exercises;

import java.util.Scanner;

public class AddNumber {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int limit = sc.nextInt();

        int sum = 0,num;
        for (int i = 0; i < limit; i++) {

            System.out.print("Enter the number " +( i + 1) + " : " );
            num = sc.nextInt();

            sum += num;


        }
        System.out.println("sum of given number : "+ sum);
    }
}
