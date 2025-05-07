package ArraysProgramming.PracticeProgram;

public class MoveAllZeroToEndOfArray {
    public static void main(String[] args) {

        int[] arr = {4, 3, 0, 3, 0, 2, 6};

        int[] newArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                newArr[index++] = arr[i];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }



        // NO extra array

      /*  int[] arr = {4, 3, 0, 3, 0, 2, 6};
         int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println("Move all zero to end of the array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

       */




    }
}
