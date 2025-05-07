package ArraysProgramming.ArraysProgram;

public class SubarraySumEqualK {

    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};

        int k = 33;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (k == sum){
                    count++;
                    System.out.println("Subarray : ");
                    for (int l = i; l <= j; l++) {
                        System.out.print(arr[l] + " ");
                    }

                }
            }
        }
        System.out.println("\n count : " +count);
    }
}
