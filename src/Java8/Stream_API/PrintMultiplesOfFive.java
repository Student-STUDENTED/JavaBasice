package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMultiplesOfFive {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(25, 11, 34, 89, 55, 35, 80);

        number.stream()
                .filter(n -> n % 5 == 0)
                .forEach(n -> System.out.println(n));



        List<Integer> num = number.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(num);
    }
}
