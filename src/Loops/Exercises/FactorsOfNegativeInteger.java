package Loops.Exercises;

import java.util.Scanner;

public class FactorsOfNegativeInteger {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num >= 0){
            System.out.println("Please enter negative integer");
            return;
        }
        int absnum = Math.abs(num); // find covert num into positive version

        for (int i = 1; i <= absnum; i++) {

            if (absnum % i == 0){
                System.out.println(-i);
            }
        }
    }
}
