package OOPs.Polymorphism;

class Additions{

    int add(double a, int b){
        return (int) (a + b);
    }

    int add(int a , double b){
        return (int) (a + b);
    }

}
public class MethodOverloadchangingSequenceOfDatatype {
    public static void main(String[] args) {

        Additions addition = new Additions();
        System.out.println(addition.add(2.0, 2));
        System.out.println(addition.add(4, 2.0));
    }
}
