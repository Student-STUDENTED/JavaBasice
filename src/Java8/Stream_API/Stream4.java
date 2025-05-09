package Java8.Stream_API;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Stream4 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2, 1, 4, 1, 2, 5, 8, 8, 4, 3, 1);


        num.stream().distinct().forEach(n -> System.out.println(n));


        Set<Integer> n = num.stream()
                .collect(Collectors.toSet());
        System.out.println(n);



        List<Integer> unique = num.stream()
                .filter(i -> Collections.frequency(num, i) == 1)
                .collect(Collectors.toList());
        System.out.println(unique);







    }
}
