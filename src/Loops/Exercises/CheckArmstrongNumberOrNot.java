package Loops.Exercises;

import java.util.Scanner;

public class CheckArmstrongNumberOrNot {

    public static void main(String[] args) {

        System.out.print("Enter the number : ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int original = num;


        int count = 0;
        int temp = num;
        while (temp != 0) {

            int digits = temp % 10;

            count++;
            temp /= 10;
        }
        int sum = 0;
        temp = num;

       while (temp != 0){
           int digit = temp % 10;

           int power = 1;
           for (int i = 0; i < count; i++) {
               power *= digit;
           }
           sum += power;
           temp /= 10;

       }
        if (sum == original){
            System.out.println(sum +" is Armstrong number");
        }
        else {
            System.out.println(sum + " is not Armstrong number");
        }




        // only works for 3 digits Armstrong number

        int p = 0;
        int o = num;
       while (num > 0){

           int d = num % 10;
           p += (d * d * d);

           num /= 10;
       }
       if (p == o){
           System.out.println(p + " Armstrong number");
       }
       else {
           System.out.println(p + " not Armstrong number");
       }
    }

}
