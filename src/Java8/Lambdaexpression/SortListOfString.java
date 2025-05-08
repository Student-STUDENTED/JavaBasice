package Java8.Lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class SortListOfString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Red", "Blue", "White", "Pink", "Yellow");


        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("Sorted list  : " +list);
    }
}
