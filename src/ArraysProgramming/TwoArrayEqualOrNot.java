package ArraysProgramming;

public class TwoArrayEqualOrNot {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 7, 4};
        int[] arr2 = {2, 5, 1, 7, 4};


        if(arrayEqualOrNot(arr1, arr2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not");
        }

    }
    public static boolean arrayEqualOrNot(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
             return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                 return false;
            }
        }
         return true;
         }

    }

