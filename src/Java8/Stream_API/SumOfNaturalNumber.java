package Java8.Stream_API;

import java.util.stream.IntStream;


public class SumOfNaturalNumber {

    public static void main(String[] args) {

        int n = 10;

        int sum = IntStream.rangeClosed(0, n).sum();
        System.out.println("Sum of nth natural number : " +sum);





        int sums = IntStream.iterate(1, i -> i + 1)
                .limit(n)
                .sum();

        System.out.println(sums);

    }
}
