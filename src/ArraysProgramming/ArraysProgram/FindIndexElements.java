package ArraysProgramming.ArraysProgram;

public class FindIndexElements {

    public static void main(String[] args) {

        int[] arr= { 2, 1, 4, 8, 40, 30, 2, 6,9};

        int target = 40;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Index of element : " + i);
            }
        }



        int index = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                found = true;
                index = i;
                break;
            }
        }
        if (found){
            System.out.println("Elements found at index " +index);
        }
        else {
            System.out.println("Elements not found in the array");
        }
    }
}
