package Java8.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        List<Integer> listOfNumber = Arrays.asList(3, 1, 33, 11, 4, 8, 55, 90);


        int max = listOfNumber.stream().max(Comparator.naturalOrder()).get();
        System.out.println("maximum : " +max);

        int min = listOfNumber.stream().min(Comparator.naturalOrder()).get();
        System.out.println("minimum : " +min);




        int maxm = listOfNumber.stream().max((a, b)-> Integer.compare(a, b)).orElse(null);
        System.out.println(maxm);

        int mini = listOfNumber.stream().min((a, b) -> Integer.compare(a, b)).orElse(null);
        System.out.println(mini);

    }
}
