package Loops.Exercises;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum range : ");
        int maxrange = sc.nextInt();

        Random random = new Random();

        int num = 10;
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(maxrange);

            System.out.println(randomNumber);

        }
    }
}
