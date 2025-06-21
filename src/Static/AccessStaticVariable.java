package Static;

class Demo{

    int a = 10;
    static int b = 20;

    void method1(){
        System.out.println(a);
        System.out.println(b);
    }

    static void method2(){
        System.out.println(b);
    }
}
public class AccessStaticVariable {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method1();
        Demo.method2();

    }
}
