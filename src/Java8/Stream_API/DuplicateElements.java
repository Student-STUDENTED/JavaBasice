package Java8.Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {


        List<Integer> listOfInteger = Arrays.asList(222, 111, 666, 333, 111, 444, 222, 999, 666);

        Set<Integer> elements = new HashSet<>();

        Set<Integer> duplicateElements = listOfInteger.stream().filter(i -> ! elements.add(i))
                .collect(Collectors.toSet());
        System.out.println(duplicateElements);







        listOfInteger.stream().filter(i -> Collections.frequency(listOfInteger, i) > 1)
                .collect(Collectors.toSet())
                .forEach(i -> System.out.println(i));

    }
}
