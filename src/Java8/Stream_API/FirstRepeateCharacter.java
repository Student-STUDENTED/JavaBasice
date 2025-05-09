package Java8.Stream_API;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeateCharacter {

    public static void main(String[] args) {

        String str = "java concept of day ";

        Set<Character> seenCharacter = new HashSet<>();

        char c = str.chars()
                .mapToObj(i -> (char) i)
                .filter(i -> !seenCharacter.add(i))
                .findFirst()
                        .get();

        System.out.println(c);
    }
}
