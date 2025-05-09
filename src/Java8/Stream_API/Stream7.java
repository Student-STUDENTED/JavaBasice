package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;

public class Stream7 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(34, 2, 11, 55, 40, 20, 60, 99, 1);

        Integer max = num.stream()
                .max((a, b) -> a.compareTo(b))
                .orElse(null);

        System.out.println("Maxumin : " +max);


        Integer min = num.stream()
                .min((a, b) -> a.compareTo(b))
                .orElse(null);
        System.out.println("Minumim : " +min);




    }
}
