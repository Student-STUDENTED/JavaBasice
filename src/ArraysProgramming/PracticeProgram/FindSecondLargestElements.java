package ArraysProgramming.PracticeProgram;

public class FindSecondLargestElements {
    public static void main(String[] args) {
        
         int[] arr = {70, 30, 20, 80, 60,10};

         if (arr.length < 2){
             System.out.println("Array should hava at least two elements");
         }
         
         int max = arr[0];
         int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secondLargest = max;
                max = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != max){
                secondLargest = arr[i];

            }
        }
        System.out.println("Second Largest vlaue : " +secondLargest);


//        Arrays.sort(arr);
//        int index = arr.length-1;
//        while (arr[index] == arr[arr.length-1]){
//            index--;
//        }
//        System.out.println(arr[index]);

    }
}
