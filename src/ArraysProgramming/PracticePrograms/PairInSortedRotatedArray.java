package ArraysProgramming.PracticePrograms;

public class PairInSortedRotatedArray {

    public static void main(String[] args) {

        int[] arr = {11, 15, 6, 8 ,9, 10};

        int target = 16;
        int n = arr.length;

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                index = i;
                break;
            }

        }
        int left = (index + 1) % n;
        int right = index;

        boolean found = false;
        while (left != right){
            int sum = arr[left] + arr[right];

            if (sum == target){
                System.out.println("Pair found" );
                found = true;
                break;
            }
            else if (sum < target){
                left = (left + 1) % n;
            }
            else {
                right = (n + right - 1) % n;
            }

        }
        if (!found){
            System.out.println("No pair found");
        }




//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 1; i < n-1; i++) {
//            if (arr[i] < arr[minIndex]) {
//                minIndex = i;
//            }
//
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//        int left = minIndex;
//        int right = maxIndex;
//
//        boolean found = false;
//        while (left != right){
//            int sum = arr[left] + arr[right];
//            if (sum == target) {
//                System.out.println("Pair found");
//                found = true;
//                break;
//            }
//            if (sum < target){
//                left = (left + 1) % n;
//            }
//            else {
//                right = (n + right - n) % n;
//            }
//        }
//        if(!found){
//            System.out.println("No pair found");
//        }



    }
}
