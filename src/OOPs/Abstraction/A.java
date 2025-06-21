package OOPs.Abstraction;

public interface A {

    void show();

}
class B implements A {

    public void show() {
        System.out.println("show");
    }
}

class C implements A{

    @Override
    public void show() {
        System.out.println("Display");
    }


    public static void main(String[] args) {
        B b = new B();
        b.show();
        C c = new C();
        c.show();
    }
}







