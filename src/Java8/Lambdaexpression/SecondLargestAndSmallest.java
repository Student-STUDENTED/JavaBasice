package Java8.Lambdaexpression;


interface FindSecond{

    int find(int[] arr);
}
public class SecondLargestAndSmallest {
    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 2, 6, 7, 9, 1, 5};

        FindSecond secondLargest = (n -> {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for(int num : n){
                if (num > max){
                    secondMax = max;
                    max = num;
                }else if (num < max && num > secondMax){
                    secondMax = num;
                }
            }
            return (secondMax == Integer.MIN_VALUE)? -1 : secondMax;
        });
        FindSecond secondSmallest = (n -> {
            int min = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            for (int num : n){
                if (num < min){
                    secondMin = min;
                    min = num;
                }else if (num > min && num < secondMin){
                    secondMin = num;
                }
            }
            return (secondMin == Integer.MAX_VALUE) ? -1 : secondMin;
        });

        System.out.println("Second Largest : " +secondLargest.find(arr));
        System.out.println("Second smallest : " +secondLargest.find(arr));
    }
}
