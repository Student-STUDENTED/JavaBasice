package ArraysProgramming.PracticeProgram;

public class DifferencBetweenLargestAndSmallest {
    public static void main(String[] args) {

        int[] arr = { 80, 30, 20, 50, 40};
        int max = arr[0];
        int min = arr[0];

        int i = 0;
        while (i < arr.length){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        int result = max - min;

        System.out.println("Differenc Between the largest and smallest values of the array : " +result);
    }
}
