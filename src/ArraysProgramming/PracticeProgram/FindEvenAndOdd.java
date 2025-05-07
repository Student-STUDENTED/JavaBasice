package ArraysProgramming.PracticeProgram;

public class FindEvenAndOdd {
    public static void main(String[] args) {

        int[] arr = {44, 33, 53, 62, 20, 49};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.println("Even number : " + arr[i] + "  ");
            }
            else {
                System.out.println("Odd number : " +arr[i] + "  ");
            }
        }
    }
}
