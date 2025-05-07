package ArraysProgramming.PracticePrograms;

public class FindSmallestAndSecondSmallest {
    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 6, 7, 9};

        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minFirst){
                minSecond = minFirst;
                minFirst = arr[i];
            }

             if (arr[i] > minFirst && arr[i] < minSecond){
                minSecond = arr[i];
            }
        }

        if (minSecond == Integer.MAX_VALUE){
            System.out.println("No second smallest element");
        }else {
            System.out.println("Smallest element : " +minFirst);
            System.out.println("Second smallest element : " +minSecond);
        }
    }
}
