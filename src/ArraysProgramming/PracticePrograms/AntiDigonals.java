package ArraysProgramming.PracticePrograms;

public class AntiDigonals {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 5}};

        int n = matrix.length;

        for (int col = 0; col < n; col++) {
            int i = 0;
            int j = col;
            while (i < n && j >= 0) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }

        for (int row = 1; row < n; row++) {
            int i = row;
            int j = n - 1;
            while (i < n && j >= 0) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
    }
}
