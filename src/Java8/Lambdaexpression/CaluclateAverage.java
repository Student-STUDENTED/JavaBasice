package Java8.Lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class CaluclateAverage {

    public static void main(String[] args) {

        List<Double> list = Arrays.asList(2.2, 4.4, 4.2, 8.0, 2.0);

        double[] sum = {0.0};

        list.forEach(n -> sum[0] += n);

        double average = sum[0] / list.size();

        System.out.println(average);
    }
}
