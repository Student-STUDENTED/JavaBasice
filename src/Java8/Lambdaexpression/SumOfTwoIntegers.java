package Java8.Lambdaexpression;

interface sumCalculator{

    int  sum(int a, int b);

}


public class SumOfTwoIntegers {
    public static void main(String[] args) {
        sumCalculator sumcla = (a, b)-> a + b;
        //int result = sumcla.sum(5,2);
        System.out.println(sumcla.sum(5,3));
    }
}
