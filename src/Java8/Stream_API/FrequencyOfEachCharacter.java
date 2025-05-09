package Java8.Stream_API;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str = "java is Programming language";


        Map<Character, Long> charCount = str.chars()  // get stream of ASCII value
                .filter(c -> c != ' ')

                .mapToObj(c -> (char) c)        // coverts ascii to character

                //group character and count
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(charCount);







        Map<Character, Integer> frequency = new HashMap<>();
                str.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> {
                    frequency.put(c, frequency.getOrDefault(c, 0) + 1);
                });
        System.out.println(frequency);


    }
}
