package ArraysProgramming.PracticeProgram;

public class RemoveDuplicateUpdateLengthOfArray {
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]){
                    arr[j] = arr[n-1];
                    j--;
                    n--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\nUpdated array length is : " +n);

    }
}
