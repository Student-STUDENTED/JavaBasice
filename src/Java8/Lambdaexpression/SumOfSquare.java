package Java8.Lambdaexpression;


import java.util.Arrays;
import java.util.List;

interface SquareSum{

   int calculate(List<Integer> list);

   // Map<String ,Integer> calculate(List<Integer> list);

}
public class SumOfSquare {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 3, 2, 1 , 5, 4, 6);

        SquareSum evenSquareSum = (list1 -> {
            int sum = 0;
            for (int num : list1){
                if (num % 2 == 0){
                    sum += num * num;
                }
            }
            return sum;
        });

        SquareSum oddSquareSum = (list1 ->{
            int sum = 0;
            for (int num : list1){
                if (num % 2 != 0){
                    sum += num * num;
                }
            }
            return sum;
        });
        System.out.println("Sum of square of even number : " +evenSquareSum.calculate(list));
        System.out.println("Sum of square of odd number : " +oddSquareSum.calculate(list));


//        SquareSum squareSum = (list1 -> {
//           int sumEeve = 0;
//           int sumOdd = 0;
//           for (int num : list1){
//               if (num % 2 == 0){
//                   sumEeve += num * num;
//               }
//               else {
//                   sumOdd += num * num;
//               }
//           }
//            Map<String, Integer> results = new HashMap<>();
//           results.put("even", sumEeve);
//           results.put("odd", sumOdd);
//
//           return results;
//        });
//        Map<String, Integer> map = squareSum.calculate(list);
//
//        System.out.println("sum of even : " +map.get("even"));
//        System.out.println("sum of odd : " +map.get("odd"));
//



    }
}
