package ArraysProgramming.PracticeProgram;

public class AddTwoMatricesOfSameSize {
    public static void main(String[] args) {

        int[][] matrix1 ={{2, 2}, {2, 2}};
        int[][] matrix2 ={{1, 2}, {3, 4}};

        int[][] sum = new int[matrix1.length][matrix2.length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }

        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }



//        int[][] matrix1 ={{2, 3}, {2, 2}};
//
//        int[][] sum = new int[1][2];
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[0].length; j++) {
//                sum[0][j] += matrix1[i][j];
//            }
//        }
//
//        System.out.println("Sum of each column : ");
//        for (int i = 0; i < sum[0].length; i++) {
//            System.out.println("column : " + i + " Sum : " +sum[0][i]);
//        }

        // column 0 - 4
        // column 1 - 5




    }
}
