package OOPs.Polymorphism;

class SuperClass{

    private void msg1(){
        System.out.println("msg1");
    }
    private void msg2(){
        System.out.println("msg2");
    }
}
class SubClass{

    private void msg1(){
        System.out.println("msg1 overridden");
    }

//    @Override    // compile-time error private method can not be overridden . runtime ok
//    private void msg2(){
//        System.out.println("msg2");
//    }

    public static void main(String[] args) {

        SubClass subclass = new SubClass();
        subclass.msg1();
    }
}
public class MethodOveridingAnnotation {

}
