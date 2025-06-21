package OOPs.Abstraction;

abstract class Mytest{

    abstract void calcutated(int a, int b);
}
class Addition extends Mytest{

    @Override
    void calcutated(int a, int b) {
        int sum = a + b;
        System.out.println("Sum : " +sum);
    }

}
class Subtraction extends Mytest{

    @Override
    void calcutated(int a, int b) {
        int sub = a - b;
        System.out.println("Subtract : " +sub);
    }
}
class Multiplication extends Mytest{

    @Override
    void calcutated(int a, int b) {
        int multiply = a * b;
        System.out.println("Multiply : " +multiply);
    }
}

public class abstractMethodPerformDifferentTask {
    public static void main(String[] args) {
        Addition addition = new Addition();  // creating object of classes.
        addition.calcutated(2, 1);    // calling methods by passing argument values
        Subtraction subtraction = new Subtraction();
        subtraction.calcutated(4, 1);
        Multiplication multiplication = new Multiplication();
        multiplication.calcutated(2, 4);
    }
}
