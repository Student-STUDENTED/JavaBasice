package OOPs.Polymorphism;

// Return type must be same for both parent and child class method
// primitive data type
class Rules3{

    int addition(int a, int b){
        return a + b;
    }
}
class Rules3Subclass extends Rules3{

    @Override
    int addition(int a, int b){
        return a + b;
    }
}
public class MethodOveridingRules3 {


}
