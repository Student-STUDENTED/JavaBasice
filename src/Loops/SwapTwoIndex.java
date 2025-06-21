package Loops;

public class SwapTwoIndex {
    public static void main(String[] args) {
        int[] arr = {60,30};
        System.out.println("Before swaping : " +arr);
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println("");
        }
    }
}
