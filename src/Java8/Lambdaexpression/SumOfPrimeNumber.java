package Java8.Lambdaexpression;


interface PrimeNumber{

    int calculate(int start, int end);
}

public class SumOfPrimeNumber {
    public static void main(String[] args) {

        PrimeNumber primeNumber =( start, end) -> {

           int sum = 0;

           if (start < 2){
               start = 2;
           }
            for (int i = start; i <= end; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    sum += i;
                }
            }
            return sum;
        };

        int start = 100;
        int end = 200;
        System.out.println("Sum Of prime number : " +primeNumber.calculate(start, end));


    }
}
