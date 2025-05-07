package ArraysProgramming.PracticePrograms;

import java.util.Arrays;

public class ArrangaElementsOfArray {

    public static void main(String[] args) {

        int[] nums = {44, -30, 22, 60, -2, -2, 40};

        int[] newNum = new int[nums.length];
        int start = 0;
        int end = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                newNum[start] = nums[i];
                start++;
            }
            else {
                newNum[end] = nums[i];
                end--;
            }
        }

        System.out.println("Rearranged Array : ");
        for (int i = 0; i < newNum.length; i++) {
            System.out.print(newNum[i] + " ");
        }




        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            j = i;

            while (j > 0 && (nums[j] < 0) && (nums[j - 1] > 0)) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        System.out.println("\n" +Arrays.toString(nums));
    }
}
