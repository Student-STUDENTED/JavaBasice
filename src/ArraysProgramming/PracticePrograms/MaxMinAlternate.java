package ArraysProgramming.PracticePrograms;

public class MaxMinAlternate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int [] newArr = new int[arr.length];

        int start = 0;
        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){

                 newArr[i] = arr[end];
                 end--;
            }
            else {
                newArr[i] = arr[start];
                start++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "  ");
        }
    }
}
