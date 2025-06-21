package Loops.Exercises;

public class PrintFibonacciSeries {

    public static void main(String[] args) {

        int n = 10;

        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int temp = a+b;
            a = b;
            b = temp;
        }



//        int a = 0
//        int b = 1;
//        int c = 0;
//        for (int i = 1; i <= n ; i++) {
//            System.out.println(c);
//
//            a = b;
//            b = c;
//            c = a + b;
//        }
    }
}
