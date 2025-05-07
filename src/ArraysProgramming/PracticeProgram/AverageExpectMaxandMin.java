package ArraysProgramming.PracticeProgram;

public class AverageExpectMaxandMin {
    public static void main(String[] args) {

        int[] arr = {4, 4, 15, 3, 7 ,10};

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }

        }
         sum = sum - max - min;
        System.out.println(sum);

        double average = sum / (arr.length - 2);

        System.out.println("Average value : " +average);

    }
}
