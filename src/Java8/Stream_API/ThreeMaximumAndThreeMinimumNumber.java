package Java8.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaximumAndThreeMinimumNumber {

    public static void main(String[] args) {

        List<Integer> listOfNumber = Arrays.asList(12, 3, 66, 14, 90, 84, 39, 90, 48, 20 );


        System.out.println("Maximum 3 number : ");
        listOfNumber.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Minimum 3 number : ");
        listOfNumber.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);





        List<Integer> max = listOfNumber.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(max);
        List<Integer> min = listOfNumber.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(min);





    }
}
