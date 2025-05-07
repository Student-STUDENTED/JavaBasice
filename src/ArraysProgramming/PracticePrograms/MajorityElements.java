package ArraysProgramming.PracticePrograms;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 7, 7, 7};
        int result = majority(arr);

        if (isMajority(arr, result)){
            System.out.println("Majority element : " +result);
        }else {
            System.out.println("No Majority elements");
        }


    }
    public static int majority(int [] arr){
        int count = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {

            if (count == 0){

                c = arr[i];
            }
            if (c == arr[i]){
                count++;
            }else {
                count--;
            }
        }
        return c;

    }
    public static boolean isMajority (int[] arr, int c){
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            if (c == arr[i]){
                count++;
            }
        }
        return count > arr.length/2;
    }

}
