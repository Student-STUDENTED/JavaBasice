package ArraysProgramming.PracticeProgram;

public class CheckIntegersContainTwoSpecifiedElements {
    public static void main(String[] args) {

        int[] arr = {33, 22, 44, 54, 65, 33, 88, 77};

        int num1 = 65;
        int num2 = 77;

        boolean containNum1 = false;
        boolean containNum2 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1){
                containNum1 = true;
            }
            if (arr[i] == num2){
                containNum2 = true;
            }
        }
        if (containNum1 && containNum2){
            System.out.println("Arrya contain both " +num1 + " and " +num2);
        }else {
            System.out.println("Array does not contain both " +num1 + " and " +num2);
        }


    }
}
