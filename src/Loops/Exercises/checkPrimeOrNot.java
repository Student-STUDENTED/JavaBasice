package Loops.Exercises;


import java.util.Scanner;

public class checkPrimeOrNot {

    public static void main(String[] args) {

        System.out.print("Enter the number : ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        if (n <= 1) {
            System.out.println("This is not prime number.");
            return;
        }
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not prime number.");
        }




        // Using flag
//
//        boolean isPrime = true;
//        if(n <= 1){
//            isPrime = false;
//        }
//        else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime){
//            System.out.println("This is a Prime");
//        }
//        else {
//            System.out.println("This is not prime number");
//        }



    }

}
