package ArraysProgramming.PracticePrograms;

public class SumOfFourElement {
    public static void main(String[] args) {

        int[] num = {30, 10, 40, 50, 90, 100,20, 80, 200 };

        int target = 100 ;

        for (int i = 0; i < num.length - 3; i++) {
            for (int j = i + 1; j < num.length - 2; j++) {
                for (int k = j + 1; k < num.length - 1 ; k++) {
                    for (int l = k + 1; l < num.length; l++) {
                        if (num[i] + num[j] + num[k] + num[l] == target){
                            System.out.println(num[i] + " " + num[j] + " " + num[k] + " " + num[l]);
                        }
                    }

                }
            }
        }
    }
}
