package ArraysProgramming.ArraysProgram;

public class MergeTwoSorted {

    public static void main(String[] args) {

        int[] num1 = {1, 3, 5, 6};

        int[] num2 = {2, 4, 7, 8};

        int[] mergeArray = new int[num1.length + num2.length];


        int i = 0, j = 0, k = 0;
        while (i < num1.length && j  < num2.length){

            if (num1[i] < num2[j]){
                mergeArray[k++] = num1[i];
                i++;
            }
            else {
                mergeArray[k++] = num2[j];
                j++;
            }
        }
        while (i < num1.length){
            mergeArray[k++] = num1[i];
            i++;
        }
        while (j < num2.length){
            mergeArray[k++] = num2[j];
            j++;
        }

        for (int l = 0; l < mergeArray.length; l++) {
            System.out.println(mergeArray[l]);
        }
    }

}
