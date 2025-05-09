package Java8.Stream_API;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(30);
        number.add(20);
        number.add(60);
        number.add(00);
        number.add(70);


        Double average = number.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0);
        System.out.println(average);





        int sum = 0;
        for (int i : number){
            sum += i;
        }
        double averag = sum / number.size();
        System.out.println(averag);





    }
}
