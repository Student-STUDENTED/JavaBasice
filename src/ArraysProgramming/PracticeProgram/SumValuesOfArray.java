package ArraysProgramming.PracticeProgram;

public class SumValuesOfArray {
    public static void main(String[] args) {

        int arr[] = {10,40,20,30,50,3};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : " +sum);


        // Find the sum of alternate elements in an array.
        int sums = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sums += arr[i];
        }
        System.out.println("sum of alterante elements : " +sums);



        // Find the sum of all even and odd numbers
        int total = 0, totals = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                total += arr[i];
            }else {
                totals += arr[i];
            }
        }
        System.out.println("sum of all even number : " +total);
        System.out.println("sum of odd number : " +totals);
    }
}
