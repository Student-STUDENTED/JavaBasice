package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream6 {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "Bule", "Orange", "Purple", "Black", "White");


        System.out.println("sorted in ascending : ");
       colors.stream()
                .sorted()
               .forEach(n -> System.out.println(n));

        System.out.println("sorted indescending : ");
       colors.stream()
               .sorted((s1, s2) -> s2.compareTo(s1))
               .forEach(n -> System.out.println(n));



      List<String> ascending = colors.stream()
               .sorted((a1, a2 ) -> a1.compareTo(a2))
              .collect(Collectors.toList());
        System.out.println("Ascending list : " +ascending);


        List<String> descending = colors.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println("Descending list : " +descending);

    }
}
