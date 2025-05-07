package ArraysProgramming.PracticeProgram;

public class FindCommonElementBetweenTwoArray {
    public static void main(String[] args) {
        String[] arr1 = {"Orange", "Apple", "Cherry", "Mango"};

        String[] arr2 = {"Orange", "Banana", "Pineapple", "Apple"};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])){
                    System.out.println("Common element is : " +arr1[i]);
                }
            }
        }
    }
}
