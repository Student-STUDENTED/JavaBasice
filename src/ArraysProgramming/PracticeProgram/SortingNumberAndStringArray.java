package ArraysProgramming.PracticeProgram;

import java.util.Arrays;

public class SortingNumberAndStringArray {
    public static void main(String[] args) {
        int[] arr = {44, 22, 66, 77, 88, 11};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // sorting the array in ascending order
        int i = 0;
        while (i < arr.length-1) {
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = 0;
            }
            else {
                i++;
            }
        }
        System.out.print("Sort array in ascending order : " );
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        // sorted the array in descending order
        i = 0;
        while (i < arr.length-1){
            if (arr[i] < arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = 0;
            }
            else {
                i++;
            }
        }
        System.out.print("\nsorted array in desending order : ");
        for (int j = 0; j < arr.length; j++) {
            //System.out.print( arr[j] + " ,");
        }
        System.out.println(Arrays.toString(arr));







        String[] str = {"Cherry", "Apple", "Mango", "Banana"};

//        Arrays.sort(str);
//        System.out.println("\nsorted String : " +Arrays.toString(str));

        for (int j = 0; j < str.length-1; j++) {
            for (int k = 0; k < str.length - j - 1; k++) {
                if (str[k].compareTo(str[k + 1]) > 0){
                    String temp = str[k];
                    str[k] = str[k+1];
                    str[k+1] = temp;
                }
            }
        }
        System.out.print("\nSorted array in ascending order : ");
        for (int j = 0; j < str.length; j++) {
           // System.out.print(str[j] + " ,");
        }
        System.out.println(Arrays.toString(str));
    }
}
