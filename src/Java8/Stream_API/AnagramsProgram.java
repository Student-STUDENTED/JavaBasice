package Java8.Stream_API;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramsProgram {

    public static void main(String[] args) {

        String str1 = "RaceCar";

        String str2 = "CarRace";

        String s1 = str1.toLowerCase().chars().sorted().mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());

        String s2 = str2.toLowerCase().chars().sorted().mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());

        if (s1.equals(s2)){
            System.out.println("Two string are anagram");
        }
        else {
            System.out.println("Two String are not anagram");
        }




        boolean anagram =
                Arrays.equals(str1.toLowerCase().chars().sorted().toArray(),
                        str2.toLowerCase().chars().sorted().toArray());
        System.out.println(anagram);

    }
}
