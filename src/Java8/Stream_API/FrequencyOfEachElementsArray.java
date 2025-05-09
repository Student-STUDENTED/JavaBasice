package Java8.Stream_API;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachElementsArray {

    public static void main(String[] args) {

        List<String> number = Arrays.asList("Red", "Orange", "Pink", "red", "Orange", "pink", "White", "Black");

        Map<String, Long> elementCount = number.stream()
                // convert all element to lower case
                .map(String:: toLowerCase)
                // group string and count
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        System.out.println(elementCount);





        Map<String, Integer> frequency = new HashMap<>();
                number.stream()
                .map(s -> s.toLowerCase())
                .forEach(s -> {
                    frequency.put(s , frequency.getOrDefault(s, 0) + 1);
                });
        System.out.println(frequency);


    }
}
