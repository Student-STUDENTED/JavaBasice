package ArraysProgramming.PracticePrograms;

public class ReplaceNextGreatestElement {

    public static void main(String[] args) {

        int nums[] = {55, 2, 9, 4, 3, 5};

        int maxR = -1;

        for (int i = nums.length-1; i >= 0; i--) {

            int element = nums[i];
            nums[i] = maxR;

            if (element > maxR){
                maxR = element;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
