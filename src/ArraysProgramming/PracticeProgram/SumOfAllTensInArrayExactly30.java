package ArraysProgramming.PracticeProgram;

public class SumOfAllTensInArrayExactly30 {

    public static void main(String[] args) {
        int[] arr = {40, 10, 30, 40, 20, 10, 60, 10};

        int searchNum = 10;
        int fixedNum = 30;
        System.out.println(sumOfArray(arr,searchNum,fixedNum));
    }
    public static boolean sumOfArray(int[] arr, int searchNum, int fixedNum){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum){
                sum += arr[i];
            }
        }
        if (sum == fixedNum){
            return true;
        }
        return false;
    }
}
