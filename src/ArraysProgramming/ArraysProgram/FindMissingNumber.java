package ArraysProgramming.ArraysProgram;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 8};


//        int sum1 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum1 += arr[i];
//        }
//        int sum2 = 0;
//        for (int i = 0; i <= 8; i++) {
//            sum2 += i;
//        }
//        System.out.println("Missing number : " +(sum2 - sum1));




        for (int i = 0; i < arr.length - 1; i++) {
            for (int num = arr[i] + 1; num < arr[i + 1]; num++) {

                System.out.println("missing : " + num);
            }
        }





        }

    }

