package ArraysProgramming.PracticePrograms;

public class ShiftingElement {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 0, 1, 0};


        int[] newArr = new int[arr.length];
        int start = 0;
        int last = newArr.length-1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                newArr[start] = arr[i];
                start++;
            }
            else if (arr[i] == 1){
                newArr[last] = arr[i];
                last--;
            }
        }

      //  System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");

        }

    }
}
