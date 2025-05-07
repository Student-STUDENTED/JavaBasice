package ArraysProgramming.PracticeProgram;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println(Arrays.toString(arr));

        System.out.print("Reverse the array elements : ");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("\n\nReverse array using swap : " +Arrays.toString(arr));

    }
}
