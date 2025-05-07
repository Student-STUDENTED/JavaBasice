package ArraysProgramming.PracticePrograms;

public class SumOfThreeElementsEqualTarget {
    public static void main(String[] args) {

        int[] arr = {1, -2, 0, 5, -1, -4};
        int target = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

//                        int[] a = new int[]{arr[i], arr[j], arr[k]};
//                        System.out.println(Arrays.toString(a));
                    }
                }
            }
        }
    }
}
