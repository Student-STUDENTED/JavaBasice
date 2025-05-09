package Java8.Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedIntoSingleSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 3, 7};

        int[] arr2 = {6, 8, 5, 9, 10};


        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(result));






    }
}
