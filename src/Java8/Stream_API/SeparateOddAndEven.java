package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 5, 2, 6, 9, 8, 4);

        List<Integer> evenNumber = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());


        List<Integer> oddNumber = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Even number : " +evenNumber);
        System.out.println("Odd number : " +oddNumber);





        System.out.println("Even Number : ");
        numbers.stream().filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
        System.out.println("Odd Number : ");
        numbers.stream().filter(n -> n % 2 != 0)
                .forEach(n -> System.out.println(n));
    }
}
