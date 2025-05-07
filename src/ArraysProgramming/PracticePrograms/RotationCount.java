package ArraysProgramming.PracticePrograms;

public class RotationCount {
    public static void main(String[] args) {

        int[] arr = {50, 60, 70, 90, 10, 20, 30, 40};
        int n = arr.length;
        System.out.println("Rotation count : " + count(arr, n));

        System.out.println("count : " + countrotation(arr, n));


    }

    public static int count(int[] arr , int n) {
        int start = 0;
        int end = n- 1;

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int pre = (mid + n - 1) % n;


            if (arr[mid] <= arr[next] && arr[mid] <= arr[pre]) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            else if (arr[mid] <= arr[end]) {
                end = mid - 1;

            }

        return 0;
    }

    public static int countrotation(int[] arr, int n){

        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

}
