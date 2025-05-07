package ArraysProgramming.PracticeProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {

        String[] arr = {"Java", "C++", "Python"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Arraylist : " +list);



        // Convert Arraylist to Array
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(55);
        list1.add(44);
        list1.add(77);
        list1.add(11);

        int[] array = new int[list1.size()];

        for (int i = 0; i < list1.size(); i++) {
            array[i] = list1.get(i);

        }

        System.out.print("Array : ");
        for (int ar : array){
            System.out.print(ar + " ");
        }
    }
}
