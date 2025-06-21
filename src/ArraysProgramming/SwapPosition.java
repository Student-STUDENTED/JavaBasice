package ArraysProgramming;

public class SwapPosition {
    public static void main(String[] args) {
        int[] arr = {40,20};

//        if (arr[0] > arr[1]){
//            int temp = arr[0];
//            arr[0] = arr[1];
//            arr[1] = temp;
//            System.out.println("Swap the elements in given array");
//        }else {
//            System.out.println("no need to swap elements");
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        int[] array = {50, 33, 54,77, 22,11};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
