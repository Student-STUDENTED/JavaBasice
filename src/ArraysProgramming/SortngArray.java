package ArraysProgramming;

public class SortngArray {

    public static void main(String[] args) {

        int[] arr = {40, 30 , 50, 10, 60, 20};

        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j =i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");     // print asending order
        }

        // Different way to reverse the array
        for (int i = 0; i < arr.length; i++) {
            for (int j =i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.print("\nreversed array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n\nsecond way to reverse the array : " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }





        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]  > arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        System.out.println("\n reverse : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}









class Bubblesort{
    public static void main(String[] args) {

        // time complexiy = O(n ^ 2)

        int[] array = {60, 40, 30, 90, 50, 20,10};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0 ; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] =  array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class SelectionSort{

    //selection sort.
    public static void main(String[] args) {
        int[] array = {60, 40, 30, 90, 50, 20,10};

        for (int i = 0; i < array.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

}

class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {50, 30, 20, 60, 10};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

