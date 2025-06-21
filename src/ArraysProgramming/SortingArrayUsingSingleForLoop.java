package ArraysProgramming;

public class SortingArrayUsingSingleForLoop {
    public static void main(String[] args) {
        int[] array = {40, 20, 10, 60, 70, 30};

        int i = 0;
        while (i < array.length-1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            }else {
                i++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
