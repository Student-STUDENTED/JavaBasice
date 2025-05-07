package ArraysProgramming.ArraysProgram;

public class FindSecondLargestElements {

    public static void main(String[] args) {


        int[] num = {3, 43, 44, 12, 35, 90, 50, 1, 31};

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > max){
                secondLargest = max;
                max = num[i];
            }
            else if (num[i] > secondLargest && num[i] < max){
                secondLargest = num[i];
            }
        }
        System.out.println("Second Largest elements : " +secondLargest);
    }
}
