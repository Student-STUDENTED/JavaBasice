package Constructor;


class A {

    A() {

        System.out.println("No- argument constructor");
    }

    A(int a, int b) {
        System.out.println("2 parametrized constructor");
    }

    A(int x, double y, long z) {
        System.out.println("3 parameterized constructor");
    }


}

public class constructor1 {
    public static void main(String[] args) {
         A a = new A();
        A b = new A(100, 1000);
        A c = new A(10, 20.1, 100000);


    }

}
