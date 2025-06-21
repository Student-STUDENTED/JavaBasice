package ArraysProgramming.ArraysProgram;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int[] arr = {20, 10, 40, 90, 70, 1, 50};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Maximum : " +max);
        System.out.println("Minimum : " +min);




    }
}
