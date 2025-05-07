package ArraysProgramming.ArraysProgram;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        int[] arr = {20, 30, 20, 10, 50,30, 60};

        int k = 0;
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]){
                  isDuplicate = true;
                  break;
                }
            }
            if (!isDuplicate){
                newArr[k++] = arr[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(newArr[i]);
        }
    }
}
