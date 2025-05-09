package Java8.Stream_API;


import java.util.stream.IntStream;

public class EvenNumber {

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Even number : ");
        IntStream.rangeClosed(1, n)
                .map(i -> i * 2)
                .forEach(s -> System.out.println(s));




        System.out.println();
        IntStream.iterate(2, i -> i + 2)
                .limit(n)
                .forEach(i -> System.out.print(i + " "));




    }
}
