package Loops.Exercises;

import java.util.Scanner;

public class FindPower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number : ");
        int base = sc.nextInt();
        System.out.print("Enter power number : ");
        int power = sc.nextInt();

//        double n = Math.pow(base, power);
//        System.out.println(n);

        int a = 1;

        for (int i = 1; i <= power; i++) {

            a *= base;
        }
        System.out.println("Result : " +a);


    }
}
