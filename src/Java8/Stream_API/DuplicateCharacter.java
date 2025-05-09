package Java8.Stream_API;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacter {

    public static void main(String[] args) {

        String str = "Java concept of the day";

        Set<String> seenCharater = new HashSet<>();

        str.chars().mapToObj(i -> (char)i)
                .filter(i -> !Character.isWhitespace(i) && !seenCharater.add(String.valueOf(i)))
                .forEach(i -> System.out.println(i));





        Set<String> repeated = Arrays.stream(str.split( ""))
                .filter(i -> !seenCharater.add(i))
                .collect(Collectors.toSet());
        System.out.println(repeated);







    }
}
