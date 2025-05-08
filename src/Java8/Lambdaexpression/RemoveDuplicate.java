package Java8.Lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 5, 6, 1, 2, 2, 5, 6, 7);

        List<Integer> uniqueList = new ArrayList<>();

        list.forEach(n -> {
            if (!uniqueList.contains(n)){
                uniqueList.add(n);
            }
        });
        System.out.println(uniqueList);
    }
}
