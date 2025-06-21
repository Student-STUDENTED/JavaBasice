package ArraysProgramming.ArraysProgram;

public class SumOfElements {

    public static void main(String[] args) {

        int[] arr = {30, 10, 40, 60, 20, 10, 20};


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        System.out.println("sum of elements : " +sum);


    }
}
