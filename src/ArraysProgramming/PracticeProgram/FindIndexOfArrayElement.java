package ArraysProgramming.PracticeProgram;

public class FindIndexOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,3,6};
        int index = 5;

//        int  num = 5;
//        for (int i = 0; i < arr.length; i++) {
//            if (num == arr[i]){
//                System.out.println("Index position of num is : " +i);
//            }
//        }
        int targert = findIndex(arr, index);
        if (targert != -1){
            System.out.println("Element " +index+ " is found at index : " +targert);
        }else {
            System.out.println("Element " +index+ " is not found at array");
        }
    }

    public static int findIndex(int[] arr, int index) {
        if (arr.length == 0) {
            System.out.println("element is not available");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                return i;
            }
        }
        return -1;
    }
}
