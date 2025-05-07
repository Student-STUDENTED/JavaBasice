package ArraysProgramming.PracticeProgram;

public class CalculateAverageValue {

    public static void main(String[] args) {
        int[] num = {50,20,50,40,60};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double average = sum / num.length;
        System.out.println("Average value of array elements is : " +average);
    }


    // Find the average of prime numbers in an integer array
    int[] numbers = {4,6,3,6,1,7,5};


}
