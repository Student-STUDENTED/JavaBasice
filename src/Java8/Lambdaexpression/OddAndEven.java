package Java8.Lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class OddAndEven {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 4, 2, 6, 5, 9, 55, 22, 66, 89);

        System.out.println("Even number : ");
        list.forEach(n -> {if(n % 2 == 0) System.out.print(n + " "); } );


        System.out.println("\nOdd number : ");
        list.forEach(n -> {if (n % 2 != 0) System.out.print(n + " ") ; });



    }
}
