package Constructor;

class B {

    B(int a) {
        // constructor
    }


    private B() {
        System.out.println("Private constructor");
    }

    void method() {
        B b = new B();
    }

}


public class Constructor {
    public static void main(String[] args) {

        B b = new B(10);
        b.method();
    }

}