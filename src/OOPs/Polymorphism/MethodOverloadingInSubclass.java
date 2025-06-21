package OOPs.Polymorphism;


class Superclass{

    void display(int a, int b){
        System.out.println("Super class");
    }
}
class Subclass extends Superclass{

    void  display(int a, int b, int c){
        System.out.println("Sub class");
    }
}
public class MethodOverloadingInSubclass {
    public static void main(String[] args) {

        Subclass subclass = new Subclass();
        subclass.display(2,1,4);
        subclass.display(3,4);

    }
}
