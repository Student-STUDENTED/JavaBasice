package OOPs.Abstraction;

public abstract class Hello {

    // Declaration of instance method
    public void msg1(){
        System.out.println("Hello");
    }

    // Abstact method
    abstract void msg2();     // declaration
}

class Test extends Hello{

    // overriding abstract method
    @Override
    void msg2() {
        System.out.println("Hello , msg2");
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.msg1();
        test.msg2();
    }
}


