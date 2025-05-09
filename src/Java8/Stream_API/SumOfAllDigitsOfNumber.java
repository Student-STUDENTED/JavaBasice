package Java8.Stream_API;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfNumber {

    public static void main(String[] args) {

        int num = 12345;


        Integer sum = Stream.of(String.valueOf(num).split(""))
                .mapToInt(s  -> Integer.parseInt(s))
                .sum();
        System.out.println("Sum of digits : " +sum);





        Integer sumOfDigits = Stream.of(String.valueOf(num).split(""))
                .collect(Collectors.summingInt(s -> Integer.parseInt(s)));
        System.out.println("Sum : " +sumOfDigits);
    }
}
