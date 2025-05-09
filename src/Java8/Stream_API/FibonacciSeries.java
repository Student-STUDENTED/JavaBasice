package Java8.Stream_API;


import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {

        int nums = 10;


        Stream.iterate(new int[] {0, 1}, i -> new int[] {i[1], i[0] + i[1]})
                .limit(10)
                .map(i -> i[0])
                .forEach(i -> System.out.println(i));
    }
}
