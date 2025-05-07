package ArraysProgramming.PracticeProgram;

import java.util.Arrays;

public class RemoveSpecificElements {
    public static void main(String[] args) {
        int[] num = {44, 55, 88, 22, 66, 99};


        int removeElement = 22;
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != removeElement) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != removeElement){
                newArr[index++] = num[i];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            // System.out.print(newArr[i] + " ");
        }
        System.out.println(Arrays.toString(newArr));




    }
}
