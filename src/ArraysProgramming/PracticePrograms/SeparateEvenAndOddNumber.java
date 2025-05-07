package ArraysProgramming.PracticePrograms;

public class SeparateEvenAndOddNumber {
    public static void main(String[] args) {

        int[] nums = {4, 3, 6, 2 , 1, 99, 5, 6, 8};

        int[] result = new int[nums.length];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                result[index++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0){
                result[index++] = nums[i];
            }
        }
        System.out.println("First even numbers then odd : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }

    }
}
