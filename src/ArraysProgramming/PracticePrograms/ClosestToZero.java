package ArraysProgramming.PracticePrograms;

public class ClosestToZero {
    public static void main(String[] args) {

        int[] arr = {4, 2, 55, 3, -2, 3, 1, 2};

        int minNum1 = 0;
        int minNum2 = 1;
        int minSum = arr[0] +arr[1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                if (Math.abs(minSum) > Math.abs(sum)){

                    minSum = sum;
                    minNum1 = i;
                    minNum2 = j;
                }
            }
        }
        System.out.println("Two element sum is mininum : " + arr[minNum1] + " is " + arr[minNum2]);

    }
}
