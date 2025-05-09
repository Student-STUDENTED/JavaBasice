package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;

public class Stream8 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(33, 10, 30, 50, 20, 60, 90, 39, 1);

        Integer large = num.stream()
                .sorted((a,b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second largest : " + large );


        Integer secondSmall = num.stream()
                .sorted((a, b) -> a - b)
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second largest : " +secondSmall);
    }
}
