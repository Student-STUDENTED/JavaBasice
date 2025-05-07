package ArraysProgramming.PracticeProgram;

public class FindSecondSmallestElements {
    public static void main(String[] args) {

        int[] arr = {70, 30, 20, 80, 60,10};

        int min = arr[0];
        int secondSmallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                secondSmallest = min;
                min = arr[i];
            }
             if (arr[i] < secondSmallest && arr[i] != min){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest values : " + secondSmallest);
    }
}
