package ArraysProgramming.PracticePrograms;

public class CheckSubArray {

    public static void main(String[] args) {

        int[] nums =  { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };


        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {

                sum += nums[j];
                maxSum = Math.max(sum, maxSum);

                if (sum < 0){
                    sum = 0;
                }
            }
        }
        System.out.println(maxSum);
    }
}
