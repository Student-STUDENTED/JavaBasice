package Java8.Stream_API;

import java.util.Arrays;
import java.util.List;

public class GetLastElements {

    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("one", "two", "five", "seven", "nine");

       String elements =  listOfString.stream()
                .skip(listOfString.size() - 1).findFirst().get();
        System.out.println(elements);



        String e = listOfString.stream()
                .reduce((first, second) -> second)
                .get();
        System.out.println(e);
    }
}
