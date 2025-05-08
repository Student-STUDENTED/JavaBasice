package Java8.Lambdaexpression;


import java.util.Arrays;
import java.util.List;

interface Average{

    double averageLength(List<String> list);
}

public class FindAverageLengthOfList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Four");

        Average length = (list1 -> {

            int sum = 0;
            for (String s : list1) {
                // Sum of string length
                sum += s.length() ;

            }

            return sum / list1.size();
        });

        System.out.println(length.averageLength(list));

    }
}
