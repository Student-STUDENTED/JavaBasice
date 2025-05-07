package ArraysProgramming.ArraysProgram;

public class CheckArrayIsSorted {
    public static void main(String[] args) {

        int[] arr = {12, 34, 52, 56, 61, 63, 70, 80};

        if (sorted(arr)){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is not sorted");
        }

    }
    public static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }

}
