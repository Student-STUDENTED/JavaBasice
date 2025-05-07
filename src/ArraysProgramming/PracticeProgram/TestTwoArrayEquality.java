package ArraysProgramming.PracticeProgram;

import java.util.Arrays;

public class TestTwoArrayEquality {
    public static void main(String[] args) {

        int[] arr1 = {3, 2, 5, 1, 6};

        int[] arr2 = {3, 2, 5, 1, 6};

        boolean isEqual = true;

        if (arr1.length != arr2.length){
            isEqual = false;
        }
        else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    isEqual = false;
                    break;
                }
            }
        }
        if (isEqual){
            System.out.println("Two array are equal");
        }else {
            System.out.println("Two array are not equal");
        }






        // Using Arrays.equal()
        System.out.println("\nUsing Arrayas.equals() : ");
        if (Arrays.equals(arr1, arr2)){
            System.out.println("Two array are equal");
        }
        else {
            System.out.println("Two array are not equal");
        }



    }
}
