package OOPs.Inheritance.SingleInheritance;

public class Calcutator {

    double num1;
    double num2;

    public void dispalyValue(){
        System.out.println("num1 : " +num1);
        System.out.println("num2 : " + num2);
    }
}

class SimpleCalcutator extends Calcutator {

    public double add(){
        return num1 + num2;
    }
    public double subtract(){
        return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1 / num2;
    }

}

class Program6{
    public static void main(String[] args) {

        SimpleCalcutator cal = new SimpleCalcutator();

        cal.num1 = 30;
        cal.num2 = 10;

        cal.dispalyValue();
        System.out.println("Addition : " + cal.add());
        System.out.println("Subtraction : " + cal.subtract());
        System.out.println("Multiplication : " +cal.multiply());
        System.out.println("Division : " +cal.divide());
    }
}
