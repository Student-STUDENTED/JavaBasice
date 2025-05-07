package ArraysProgramming.PracticeProgram;

import java.util.Arrays;

public class LongestConsecutiveElements {
    public static void main(String[] args) {

        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int longest = 1;
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]){
                continue;
            }
            else if (array[i] == array[i - 1] + 1){
                count++;
            }
            else {
                if (count > longest){
                    longest = count;
                }
            }
            count =1;
        }
        if (count > longest){
            longest = count;
        }
        System.out.println(count);
    }
}
