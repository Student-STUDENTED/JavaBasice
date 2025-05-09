package Java8.Stream_API;

import Java8.LambdaExpression;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOddNumber {

    public static void main(String[] args) {

        int num = 10;

         IntStream.range(0, num)
                .map(i -> i * 2 + 1)
                .forEach(i -> System.out.println(i));



         IntStream.iterate(1, n -> n + 2)
                 .limit(10)
                 .forEach(n -> System.out.println(n));


    }
}
