package OOPs.Polymorphism;

class Substraction{

    int sub(int a, int b){
        return a - b;
    }

    double sub(double a, double b, double c){
        return a - b - c;
    }
}
public class MethodOverloadChangingTypeOfParameter {

    public static void main(String[] args) {

       Substraction substraction = new Substraction();
        System.out.println(substraction.sub(4, 2));
        System.out.println(substraction.sub(5, 1, 6));
    }
}
