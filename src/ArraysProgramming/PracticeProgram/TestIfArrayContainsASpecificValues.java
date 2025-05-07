package ArraysProgramming.PracticeProgram;

public class TestIfArrayContainsASpecificValues {

    public static boolean contains(int[] arr, int item){
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]){
                return true;
            }
        }
        return false;
    }
    // Array contains all elements of another array
    public static boolean containAllElements(int[] arr, int [] arr1){
        for (int i = 0; i < arr.length; i++) {
            boolean contain = false;
            for (int j = 0; j < arr1.length ; j++) {
                if (arr[i] == arr1[j]) {
                    contain= true;
                    break;
                }
            }
            if (!contain){
                return false;
            }
        }
        return true; // all elements contains.

    }
    // Array contain only unique value
    public static boolean containUniqueValue(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Array contains at least one negative number
    public static boolean containOneNegativeNo(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0){
                System.out.println(arr1[i]);
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {21, 43, 55, 66, 77, 23,55};

        int[] arr1 = {21, 55, 43, -6, 77, 23, 88};

//        System.out.println("check contains of specific elements : ");
//        System.out.println(contains(arr, 66));
//        System.out.println(contains(arr, 87));
//
//        System.out.println("\nArray contain all elements of another array : ");
//        System.out.println(containAllElements(arr,arr1));
//
//        System.out.println("\ndoes Array contain only unique value : " +containUniqueValue(arr));

        System.out.println("\ndoes the Array contain atleast one negative no. : " +containOneNegativeNo(arr));
    }
}
