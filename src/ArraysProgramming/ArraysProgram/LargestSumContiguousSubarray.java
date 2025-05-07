package ArraysProgramming.ArraysProgram;

public class LargestSumContiguousSubarray {

    public static void main(String[] args) {

        int[] num = {10, 20, 40, 30, 50, 10};

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            int sum = 0;

            for (int j = i; j < num.length; j++) {

                sum += num[j];

                if (sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);





        int maxSum = num[0];
        int sum = num[0];
        for (int i = 1; i < num.length; i++) {

            sum = Math.max(num[i] , sum + num[i]);
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);

    }
}
