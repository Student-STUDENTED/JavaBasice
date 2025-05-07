package ArraysProgramming.PracticePrograms;

public class SeparateZeroAndOne {
    public static void main(String[] args) {

        // Sparate  0 on left side and 1 on right side
        int[] num = {1, 1, 0, 1, 0, 0, 1, 0};

        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] ==  0){
                num[index++] = num[i];
            }
        }
        for (int i = index; i < num.length; i++) {
            num[i] = 1;

        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
