package ArraysProgramming.PracticeProgram;

public class CommonElementfromThreeSortedArray {
    public static void main(String[] args) {

        int[] array1 = {3, 1, 2, 4, 5, 6};
        int[] array2 = {1, 0, 4, 5, 3};
        int[] array3 = {4, 5, 10, 33 };

        System.out.println("Common Elements from three sorted Array is : ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
              if (array1[i] == array2[j]){
                  for (int k = 0; k < array3.length; k++) {
                      if (array2[j] == array3[k]){
                          System.out.println(array1[i]);

                      }
                  }
              }
            }
        }



        // using while loop

        int i = 0, j = 0, k = 0;
        System.out.println("Common elements : " );
        while (i < array1.length && j < array2.length && k < array3.length){
            if (array1[i] == array2[j] && array2[j] == array3[k]){
                System.out.println(array1[i]);
                i++;
                j++;
                k++;
            }
            else if(array1[i] < array2[j]){
                i++;
            }
            else if (array2[j] < array3[k]){
                j++;
            }
            else {
                k++;
            }
        }
    }
}

