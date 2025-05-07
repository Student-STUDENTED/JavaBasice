package ArraysProgramming.ArraysProgram;

public class SortArrayOf0s1s2s {

    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0, 2, 0, 2, 1, 1, 0};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < num.length; i++) {

           if (num[i] == 0){
               count0++;
           }
           else if (num[i] == 1){
               count1++;
           }
            else {
               count2++;
           }
        }
        int index = 0;
        for (int i = 0; i < count0; i++) {
            num[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            num[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            num[index++] = 2;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
