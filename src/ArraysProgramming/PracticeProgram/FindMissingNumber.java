package ArraysProgramming.PracticeProgram;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,7,8,9};

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        int sum2 = 0;
        for (int i = 0; i <= 9; i++) {
            sum2 += i;
        }
        System.out.println("Missing number is : " +(sum2-sum1));




        // another way to solve
//        int num = 0;
//        for (int i = 0; i <= 9; i++) {
//            num += i;
//        }
        int n = arr.length + 1;
        int num = (n * (n + 1))/ 2;

        for (int i = 0; i < arr.length; i++) {
            num -= arr[i];
        }
        System.out.println("Missing number is : " +num);
    }
}
