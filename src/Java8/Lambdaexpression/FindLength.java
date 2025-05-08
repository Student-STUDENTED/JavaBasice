package Java8.Lambdaexpression;


import java.util.Arrays;
import java.util.List;

interface Length{

    int findLength(List<String> list);
}
public class FindLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Appel", "Banana", "Orange", "Cherry", "Pineapple");

        Length longest = (l -> {
            int max = Integer.MIN_VALUE;
            for (String str : l){
                if (str.length() > max) {
                    max = str.length();
                }
            }
            return max;
        });
        Length smallest = (l -> {
            int min = Integer.MAX_VALUE;
            for (String str : l){
                if (str.length() < min){
                    min = str.length();
                }
            }
            return min;
        });
        System.out.println(longest.findLength(list));
        System.out.println(smallest.findLength(list));

    }
}
