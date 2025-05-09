package Java8.Stream_API;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ReverseEachWordOfString {

    public static void main(String[] args) {

        String str = "java concept of day";

        String reverse = Arrays.stream(str.split(" "))

                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);





        String str1 = "java concept of day";

        String reverseStr = IntStream.range(0, str1.length())
                .mapToObj(s -> str1.charAt(str1.length() - 1- s))

                .map(s -> String.valueOf(s))
                .collect(Collectors.joining());
        System.out.println(reverseStr);
    }
}
