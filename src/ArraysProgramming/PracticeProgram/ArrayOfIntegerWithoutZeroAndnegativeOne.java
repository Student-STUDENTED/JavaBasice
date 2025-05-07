package ArraysProgramming.PracticeProgram;

public class ArrayOfIntegerWithoutZeroAndnegativeOne {
    public static void main(String[] args) {

        int[] arr = {4, 2, 5, -1, 6, 8};
        
        boolean check = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Array does not contain 0 and -1");
        }else {
            System.out.println("Array does contain 0 and -1");
        }





        // using another way
       // int[] arr = {4, 2, 5, 6, 8};

        System.out.println("Array element is without specific elements  : " +checkZeroAndMinone(arr));
    }

    public static boolean checkZeroAndMinone(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] == 0 || arr[i] == -1){
                return false;
            }
            i++;
        }
        return true;
    }
}
