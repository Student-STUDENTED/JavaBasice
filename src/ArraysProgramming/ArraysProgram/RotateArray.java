package ArraysProgramming.ArraysProgram;

public class RotateArray {

    public static void main(String[] args) {
        
        int[] array = {10, 20 , 30, 40, 50};
        int k = 3;

        k = k % array.length;
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k , array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void reverse(int[] array, int start, int end){

        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
