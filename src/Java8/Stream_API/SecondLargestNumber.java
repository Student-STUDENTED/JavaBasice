package Java8.Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(2, 4, 9, 3, 8, 1, 4, 10);


        Integer second =  listOfIntegers.stream().sorted((a, b) -> b- a)
                .skip(1)
                .findFirst().orElse(null);
        System.out.println("Second largest number : " +second);




        Integer secondLargest = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLargest);







    }
}
