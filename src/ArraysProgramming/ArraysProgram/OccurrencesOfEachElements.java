package ArraysProgramming.ArraysProgram;

public class OccurrencesOfEachElements {

    public static void main(String[] args) {

        int[] arr = {2 , 3, 4, 1, 2, 5, 3, 2, 7, 8};

        boolean[] visited = new boolean[arr.length];


        for (int i = 0; i < arr.length; i++) {
            if (visited[i]){
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    count++;

                }
            }
            System.out.println("Elements : " +arr[i] +" : " + count);

        }
    }
}
