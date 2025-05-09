package Java8.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrder {
    public static void main(String[] args) {

        List<Double> decimal = Arrays.asList(4.0, 1.2, 3.6, 44.3, 7.11, 8.33, 99.8);



        // store sorted list in a list
        List<Double> sort = decimal.stream()
                .sorted(Comparator.reverseOrder())

                // collect into list
                .collect(Collectors.toList());

        System.out.println(sort);




        // Print sorted list directly
        decimal.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s));  // Print






        // comparator
        System.out.println("Custom comparator : ");
        decimal.stream()
                .sorted((a,b)-> b.compareTo(a))
                .forEach(s -> System.out.println(s));



    }
}
