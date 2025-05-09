package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;

public class FindStringStartWithNumber {
    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("One", "Two", "5Five", "7Seven", "Ten");

        listOfString.stream().filter(i -> i.length() > 0 && Character.isDigit(i.charAt(0)))
                .forEach(i -> System.out.println(i));





        listOfString.stream().filter(i -> i.matches("^[0-9].*"))
                .forEach(i -> System.out.println(i));

    }
}
