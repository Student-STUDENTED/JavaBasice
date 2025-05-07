package ArraysProgramming.PracticeProgram;

import java.util.Arrays;

public class InsertElementSpecificPosition {
    public static void main(String[] args) {
        int[] arr = {33,55,11,22,66,44,77};

        int index = 1;
        int newValue = 2;

        for (int i = arr.length-1; i > index ; i--) {
            arr[i] = arr[i-1];
        }

        arr[index] = newValue;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
