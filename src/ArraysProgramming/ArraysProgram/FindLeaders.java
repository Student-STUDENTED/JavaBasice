package ArraysProgramming.ArraysProgram;

public class FindLeaders {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 5, 7, 2};


        int max = arr[arr.length - 1];
        System.out.println(max);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max){
                max = arr[i];
                System.out.println(max);

            }
        }



    }
}
