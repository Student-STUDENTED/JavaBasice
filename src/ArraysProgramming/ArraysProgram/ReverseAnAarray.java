package ArraysProgramming.ArraysProgram;

public class ReverseAnAarray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }



        System.out.println("\nReverse elements : ");
        for (int i = 0, j = arr.length - 1; i < j; j--, i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



        System.out.println();
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for (int reverse : arr){
            System.out.print(reverse + " ");
        }


    }
}
