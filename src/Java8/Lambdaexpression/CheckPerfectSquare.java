package Java8.Lambdaexpression;


interface PerfectSquare{

    boolean isPerfectSquare(int num);
}

public class CheckPerfectSquare {
    public static void main(String[] args) {

        PerfectSquare checker = (n -> {

            int square = (int) Math.sqrt(n);
            return square * square == n;
        });

        int num1 = 36;
        System.out.println(num1 + " is perfect number " +checker.isPerfectSquare(num1));
    }
}
