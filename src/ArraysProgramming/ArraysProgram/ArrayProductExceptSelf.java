package ArraysProgramming.ArraysProgram;

public class ArrayProductExceptSelf {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4};

        int product = 1;

        for (int i = 0; i < num.length; i++) {

            product *= num[i];

        }
        for (int i = 1; i <= num.length; i++) {

            int arrProduct = product/ i;

            System.out.print(arrProduct + " ");
        }



        System.out.println();

        for (int i = 0; i < num.length; i++) {

            int products = 1;
            for (int j = 0; j < num.length; j++) {

                if (i != j){
                    products *= num[j];
                }
            }
            System.out.print(products + " ");
        }

    }
}
