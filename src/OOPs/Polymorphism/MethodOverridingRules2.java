package OOPs.Polymorphism;

// Argument of method signature must be exactly same
// as that of parent class method
public class MethodOverridingRules2 {

    void show(String a , String b){
        System.out.println("show method of parent class takes 2 arguments");
    }

}

class Rules2 extends MethodOverridingRules2{

    void show(String a , String b){
        System.out.println("Show method of child class takes 2 arguments");
    }
}
