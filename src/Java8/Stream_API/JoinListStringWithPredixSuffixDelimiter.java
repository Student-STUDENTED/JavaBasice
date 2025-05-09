package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListStringWithPredixSuffixDelimiter {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Red", "Pink", "Orange", "Yellow", "White");

        String str = list.stream()
                .reduce((a, b) -> a + ", " + b)
                .map(s -> "[" + s + "]")
                .orElse("[]");

        System.out.println(str);





      list.stream()
                .collect(Collectors.joining(" , ", "[", "]"));

        System.out.println(str);
    }
}
