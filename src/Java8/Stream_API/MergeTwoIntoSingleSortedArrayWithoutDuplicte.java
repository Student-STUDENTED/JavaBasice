package Java8.Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoIntoSingleSortedArrayWithoutDuplicte {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 3, 5, 4 , 7};

        int[] arr2 = {8, 6, 8, 8, 9, 10};


        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(result));
    }
}
