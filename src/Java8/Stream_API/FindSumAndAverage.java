package Java8.Stream_API;

import java.util.Arrays;

public class FindSumAndAverage {

    public static void main(String[] args) {

        int[] arr = {2, 10, 30, 60, 40, 50};

        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum : " +sum);

        double average = Arrays.stream(arr).average().orElse(0);
        System.out.println("Average : " +average);



    }
}
