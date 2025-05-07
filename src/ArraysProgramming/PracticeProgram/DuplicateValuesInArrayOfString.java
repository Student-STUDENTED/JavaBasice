package ArraysProgramming.PracticeProgram;

public class DuplicateValuesInArrayOfString {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Orange", "Mango", "Cherry", "Orange"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && i != j){
                    System.out.println("Duplicate value in String Array : " + arr[i]);
                }
            }
        }
    }
}
