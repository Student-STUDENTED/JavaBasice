package ArraysProgramming.PracticeProgram;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 2, 5,8};

//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]){
//                    arr[j] = arr[n-1];
//                    n--;
//                    j--;
//                }
//            }
//        }
//        System.out.println("Array after removing elements : " );
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }


        int[] temp = new int[arr.length];
        int newSize = 0;


        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]){
                    found = true;
                    break;
                }
            }
            if (!found){
                temp[newSize++] = arr[i];
            }
        }
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }




    }
}
