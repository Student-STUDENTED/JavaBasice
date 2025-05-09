package Java8.Stream_API;


import java.util.Arrays;
import java.util.List;



public class Stream5 {
    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Black", "Pink", "Yellow", "Browns", "blue", "Purple");

        long num = colors.stream()
                .map(c -> c.toUpperCase())
                .filter(c -> c.startsWith("B"))
                .count();

        System.out.println("Count : " +num);





        List<Long> count = Arrays.asList(
                colors.stream()
                .map(c -> c.toLowerCase())
                .filter(c -> c.startsWith("b"))
                .count()
                );
        System.out.println(count);


    }
}
