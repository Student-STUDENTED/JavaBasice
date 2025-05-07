package ArraysProgramming.PracticeProgram;

import java.util.Arrays;

public class CopyAnArrayByIterating {
    public static void main(String[] args) {
        int[] arr = {55,33,66,77,21,22,88};

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            //System.out.print("New Array : " +newArr[i] + " ");
        }
        System.out.println("new array : " + Arrays.toString(newArr));
    }
}
