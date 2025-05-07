package ArraysProgramming.PracticeProgram;

public class FindMaxAndMinValue {
    public static void main(String[] args) {
        int[] arr = {20, 30, 50, 20, 50, 60,10};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum value is : " +max);
        System.out.println("Minmum value is : " +min);
    }
}
