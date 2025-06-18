package Constructor;


class Superclass{

    Superclass(){
        System.out.println("superclass constructor");
    }
    Superclass(int a){
        System.out.println("1 Parameterized constructor");
    }

    Superclass(int d, String f,  String c){
        System.out.println("3 Parameterized constructor");
    }

}
class Subclass extends Superclass {

    Subclass(){
        super(10);
        System.out.println("subclass constructor");
    }
    Subclass(int x){
        super(10, "java", "java");
        System.out.println("Subclass Parameterized constructor");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {

        Superclass superclass = new Superclass();

        Subclass subclass = new Subclass();
        Subclass subclass1 = new Subclass(10);
    }

}
