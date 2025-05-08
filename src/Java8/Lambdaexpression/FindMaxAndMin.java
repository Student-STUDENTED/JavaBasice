package Java8.Lambdaexpression;


import java.util.Arrays;
import java.util.List;


interface MaxandMin{

    void find(List<Integer> list);
}
public class FindMaxAndMin {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 55, 3, 55, 6, 5, 6, 1, 60);

        MaxandMin m = (nums -> {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int num : nums){
                if (num > max) {
                    max = num;
                }
            if (num < min) {
                min = num;
            }
        }
            System.out.println("Maximum value : " +max);
            System.out.println("Minmum value : " +min);

        });
        m.find(list);


    }
}
