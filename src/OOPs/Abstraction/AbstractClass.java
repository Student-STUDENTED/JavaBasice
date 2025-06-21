package OOPs.Abstraction;

public abstract class AbstractClass {

    int a = 10;

    AbstractClass(){
        System.out.println("Abstractclass constructor");
    }

    // abstract method declaration.
    abstract void msg();

    final void finalMethod(){
        System.out.println("Final Method");
    }

    static void staticMethod(){
        System.out.println("Static method");
    }
    void InstanceMethod(){
        System.out.println("Instance method");
    }

}

class AbstractTest extends AbstractClass{

    AbstractTest(){
        System.out.println("AbstractTest constractor");
    }

    @Override
    void msg() {
        System.out.println("Implemention abstract method In the subclass");
    }


    public static void main(String[] args) {
        AbstractTest.staticMethod();
        //AbstractClass.staticMethod();

        // Create the object of subclass of abstract class
        AbstractTest t = new AbstractTest();
        t.msg();
        t.finalMethod();
       // t.staticMethod();
        t.InstanceMethod();

    }
}
