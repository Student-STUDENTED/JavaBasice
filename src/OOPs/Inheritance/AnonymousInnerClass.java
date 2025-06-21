package OOPs.Inheritance;

class A{
    public void show(){
        System.out.println("this class show A");
    }
}
//
//class B extends A{
//
//    public void show(){
//        System.out.println("This class show B");
//    }
//}


public class AnonymousInnerClass {
    public static void main(String[] args) {
//        B b = new B();
//        b.show();

        A a = new A(){
            @Override
            public void show() {
                System.out.println("This class show a");
            }
        };
        a.show();
    }
}

//The expression new A() { ... } creates an anonymous subclass of A and
// simultaneously creates an instance of that subclass.
//Inside the curly braces { ... }, you override the show() method.
