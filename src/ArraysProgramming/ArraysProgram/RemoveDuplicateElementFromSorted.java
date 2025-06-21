package ArraysProgramming.ArraysProgram;

public class RemoveDuplicateElementFromSorted {

    public static void main(String[] args) {


        int[] arr = {10, 50, 10, 30, 20, 60 , 50};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


//        for (int i = 0; i < arr.length - 1; i++) {
//
//            if (arr[i] != arr[i + 1]){
//                System.out.print(arr[i] + " ");
//            }
//        }
//        System.out.print(arr[arr.length - 1]);


        int indexUnique = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[indexUnique]){
                indexUnique ++;
                arr[indexUnique] = arr[i];
            }
        }
        for (int i = 0; i < indexUnique + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
