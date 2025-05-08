package Java8.Lambdaexpression;


interface Prime{

    boolean isPrime(int n);
}

public class CheckPrimeNumber {

    public static void main(String[] args) {
        int n = 4;
        Prime prime = (num -> {
            if (num <= 1){
                return false;
            }

            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        });


        if (prime.isPrime(n)){
            System.out.println(n + " is a prime number");
        }else {
            System.out.println(n + " is not prime number");
        }


    }
}
