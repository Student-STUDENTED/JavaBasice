package ArraysProgramming.PracticePrograms;

public class ArrangeElementsPositiveAndNegative {
    public static void main(String[] args) {

        int[] arr = {5, 3, -5, -2, 5, 6, -9};

        int[] newArr = new int[arr.length];

        int start = 0;
        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                newArr[start++] = arr[i];
            }
            else {
                newArr[end--] = arr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print( newArr[i] + "  ");
        }
    }



}
