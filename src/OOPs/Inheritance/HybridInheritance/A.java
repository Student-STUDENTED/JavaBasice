package OOPs.Inheritance.HybridInheritance;

public class A {

    void printmessege(){
        System.out.println("This class is A.");
    }
}
class B extends A{

    void PrintB(){
        System.out.println("This class is B");
    }
}
class C extends A{

    void printC(){
        System.out.println("This class is C");
    }
}
class D extends C {
    B b =  new B();

    void printD(){
        printmessege();
        printC();
        b.PrintB();
        System.out.println("This class is D");
    }
}

class Program{
    public static void main(String[] args) {

        D d = new D();
        d.printD();
    }
}
