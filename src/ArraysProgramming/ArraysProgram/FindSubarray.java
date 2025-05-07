package ArraysProgramming.ArraysProgram;

public class FindSubarray {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4};


        // Print all subarray.
        for (int start = 0; start < num.length; start++) {

            for (int end = start; end < num.length; end++) {

                for (int i = start; i <= end; i++) {
                    System.out.print(num[i] + " ");
                }
                System.out.println(" ");
            }

        }



    }
}
