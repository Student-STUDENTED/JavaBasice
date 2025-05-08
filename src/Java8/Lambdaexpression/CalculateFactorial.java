package Java8.Lambdaexpression;

interface Factorial{
    long calulate(long n);
}


public class CalculateFactorial {

    public static void main(String[] args) {

        long num = 5;

        Factorial factorial =(n -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;

        });

        System.out.println("Factorial of " +num + " is " +factorial.calulate(num));

    }
}
