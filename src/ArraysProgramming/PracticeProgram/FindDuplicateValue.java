package ArraysProgramming.PracticeProgram;

public class FindDuplicateValue {
    public static void main(String[] args) {

        int[] arr = {44, 33, 55, 66, 33, 77};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && i != j){
                    System.out.println("Duplicate value : " +arr[i]);

                }
            }
        }
    }
}
