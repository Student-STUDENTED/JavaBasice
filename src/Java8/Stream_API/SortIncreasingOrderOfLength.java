package Java8.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIncreasingOrderOfLength {

    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("red" , "Black", "Bule", "Orange", "Purple");


        System.out.println("sorted the length : ");
        listOfString.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(s -> System.out.println(s));


        System.out.println("\nsort list to increasing order of length : ");
        listOfString.stream()
                .sorted(Comparator.comparing(s -> s.length()))
                .forEach(s -> System.out.println(s));




        List<String> sortLength = listOfString.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(sortLength);

    }
}
