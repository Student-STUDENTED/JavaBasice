package ArraysProgramming;

public class
FindMissingElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8};

        // Option- 1
//        for (int i = 0; i < array.length-1; i++) {
//            for (int num = array[i] + 1 ; num <  array[i + 1]; num++) {
//                // array[i] = index0  1+1
//                // arrary[i] = index1  2+1
//                // array[i] = index2  3+1 = 4
//                System.out.println("Missing number is : " +num);
//            }
//        }

        // Option - 2
        // sum1 = 1+2+3+4+5+7+8 = 30
        // sum2 = 1+2+3+4+5+ 6 +7+8 = 36
        // sum1 - sum2 = 6

        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
       // System.out.println("sum1 : " +sum1); // 30

        int sum2 = 0;
        for (int i = 1; i <= 8; i++) {
            sum2 += i;
        }
       // System.out.println("sum2 : " +sum2);  // 36

        System.out.println("Missing number is : " +(sum2-sum1));


        // Option - 3
        // int[] array = {1,2,3,4,5,7,8};
        int n = array.length + 1;
        // 8 = 7 + 1

        int num = (n * (n + 1)) / 2;
        // 8 * (9)/ 2 = 72/2 = 36

        for (int i = 0; i < array.length; i++) {
            num = num - array[i];

        }
        System.out.println("Missing number is : " +num);



    }
}
