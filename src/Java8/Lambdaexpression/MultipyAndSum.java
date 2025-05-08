package Java8.Lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class MultipyAndSum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 2, 4, 2);
        int[] sum = {0};
        int[] multipy = {1};

        list.forEach(n -> {
            sum[0] += n;
            multipy[0] *= n;

        });

        System.out.println("sum : " +sum[0]);
        System.out.println("Multiply : " +multipy[0]);





    }
}
