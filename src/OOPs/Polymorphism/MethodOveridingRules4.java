package OOPs.Polymorphism;


// the access level cannot be more restrictive than the parent class method access level

public class MethodOveridingRules4 {

    void test(){
        System.out.println("Parent class method");
    }
}
class Rules4 extends MethodOveridingRules4{

    @Override
    public void test(){
        System.out.println("child class method");
    }
}

