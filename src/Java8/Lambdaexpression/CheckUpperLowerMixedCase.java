package Java8.Lambdaexpression;


import java.util.ArrayList;
import java.util.List;

interface Check{

    String checker(List<String> list);
}

public class CheckUpperLowerMixedCase {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");

        Check checkcase = (list1 -> {

            boolean upper = true;
            boolean lower = true;

            for (String lists : list1){
                if (!lists.equals(lists.toUpperCase())){
                    upper = false;
                }
                if (!lists.equals(lists.toLowerCase())){
                    lower = false;
                }
            }
            if (upper){
                return "All list are Uppercase";
            }
            else if(lower){
                return "All list are Lowercase";
            }
            else {
                return  "All list are Mixedcase";
            }

        });

        System.out.println(checkcase.checker(list));

    }
}
