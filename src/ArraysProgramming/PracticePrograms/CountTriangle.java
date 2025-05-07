package ArraysProgramming.PracticePrograms;

import java.util.Arrays;

public class CountTriangle {
    public static void main(String[] args) {

        int[] arr = {3, 5, 8, 4};
        int i = 0;
        while (i < arr.length-1){
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = 0;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));


        int count = 0;
        int n = arr.length;
        for (int j = n - 1;j >= 2 ; j--) {

            int left = 0;
            int right = j - 1;

            while (right > left){
                if (arr[left] + arr[right] > arr[j]) {
                    count += (right-left);
                    right--;
                }else {
                    left++;
                }
            }
        }
        System.out.println(count);
    }
}
