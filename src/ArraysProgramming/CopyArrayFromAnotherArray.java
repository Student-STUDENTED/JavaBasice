package ArraysProgramming;

public class CopyArrayFromAnotherArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int [] newArray = new int[arr.length]; // empty array

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Element present at index before coyping elements : " +newArray[i]);  // int default value is 0.
        }

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Copying elements : " +newArray[i]);
        }
    }
}

