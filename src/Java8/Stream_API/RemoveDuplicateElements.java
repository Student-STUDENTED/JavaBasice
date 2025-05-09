package Java8.Stream_API;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicateElements {

    public static void main(String[] args) {

        List<Integer> elements = Arrays.asList(3, 3, 5, 1, 8, 5, 6);

        List<Integer> unique = elements.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("After remove duplicate elements : " +unique);




        List<Integer> un = elements.stream()
                .filter(i -> Collections.frequency(elements, i) == 1)
                .collect(Collectors.toList());
        System.out.println(un);



    }
}
