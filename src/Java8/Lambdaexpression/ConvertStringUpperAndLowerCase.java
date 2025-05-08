package Java8.Lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringUpperAndLowerCase {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        list.add("Banana");


        List<String> upper = new ArrayList<>();
        List<String> lower = new ArrayList<>();

        list.forEach(s -> upper.add(s.toUpperCase()));

        list.forEach(s -> lower.add(s.toLowerCase()));

        System.out.println("UpperCase : " +upper);
        System.out.println("LowerCase : " +lower);








        // Convert string
        list.replaceAll(s -> s.toUpperCase());

        System.out.println("Upper case ----");
        for (String str : list){
            System.out.println(str);
        }

        list.replaceAll(s -> s.toLowerCase());

        System.out.println("Lower case ---------");
        for (String str : list){
            System.out.println(str);
        }



    }
}
