package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;

public class Stream3 {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2, 1, 4, 3, 6, 5, 7, 8);

        int even = num.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println("sum of even number " + even);


        int odd = num.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("sum of odd number : " +odd);
    }
}
