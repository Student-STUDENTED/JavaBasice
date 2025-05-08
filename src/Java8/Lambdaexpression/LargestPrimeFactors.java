package Java8.Lambdaexpression;


interface PrimeFactor{

    int primefactor(int num);
}

public class LargestPrimeFactors {
    public static void main(String[] args) {


        PrimeFactor largestPrimefactor = (n ->{

            for (int i = n/2; i >= 2; i--) {

                if (n % i == 0 && isPrime(i)){
                    return i;
                }
            }
            return -1;

        });

        int nums = 100;

        System.out.println(largestPrimefactor.primefactor(nums));
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
