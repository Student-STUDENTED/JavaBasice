package ArraysProgramming.PracticePrograms;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, -2, 3, 4, 5, 6};

       // int[] arr2 = {1, 2, 3, 4, 5, 6};
       // boolean result = zeroSum(arr1, arr2);
        if (zeroSum(arr1)){
            System.out.println("Array contain subarray with 0 sum" );
        }else {
            System.out.println("Array does not contain subarray with 0 sum" );
        }


    }
    public static boolean zeroSum(int[] arr1){

        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = i; j < arr1.length; j++) {

                sum += arr1[j];

                if (sum == 0){
                    return true;
                }
            }

        }

        return false;
    }

}
