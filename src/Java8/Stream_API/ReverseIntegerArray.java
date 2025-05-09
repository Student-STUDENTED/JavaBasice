package Java8.Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {


    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};


        int[] reverse = IntStream.rangeClosed(1, arr.length)
                .map(i -> arr[arr.length - i])
                .toArray();
        System.out.println("Reverse : " +Arrays.toString(reverse));




        Arrays.stream(arr).map(i -> arr[arr.length - i] )
                .forEach(i -> System.out.println(i));
    }
}
