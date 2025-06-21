package ArraysProgramming.ArraysProgram;

public class ArrayContainSpecificElements {

    public static void main(String[] args) {

        int[] arr = {20, 10, 40, 600, 20, 90, 20};
        int target = 600;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Array contain " + target);
            }
        }
        
        
        
        boolean contain = false;
        int j = 0;
        while (j < arr.length){
            if (arr[j] == target){
                contain = true;
                break;
            }
            j++;
        }
        if (contain){
            System.out.println("Array contain " +target);
        }
        else {
            System.out.println("Array not contain " +target);
        }
            

    }
}
