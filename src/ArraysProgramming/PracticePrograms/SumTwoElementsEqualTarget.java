package ArraysProgramming.PracticePrograms;

import java.util.Arrays;

public class SumTwoElementsEqualTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int target = 6;

        // print the index
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    int[] a = new int[]{i, j};
                   // System.out.println(i + ", " + j);
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
}
