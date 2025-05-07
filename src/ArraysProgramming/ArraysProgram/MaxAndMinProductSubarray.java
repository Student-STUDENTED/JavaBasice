package ArraysProgramming.ArraysProgram;

public class MaxAndMinProductSubarray {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3, 10};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {

           int product = 1;
            for (int j = i; j < arr.length; j++) {

                product *= arr[j];
                if (product > max){
                    max = product;
                }
                if (product < min){
                    min = product;
                }
            }
        }
        System.out.println("maximum product of subarray : " +max);
        System.out.println("Minimum prodcut of subarray : " +min);
    }
}
