package Static;

public class StaticExample {

    public static int a = 10;

    static void m1(){
        m2();
        System.out.println("static method1");
    }

    static void m2(){
        System.out.println("static method2");
        System.out.println(StaticExample.a);
    }

    public void m3(){
        a = 30;
        m2();
        System.out.println("static method3");
    }

    static {
        m1();
        System.out.println("static block");
    }

    public static void main(String[] args) {
        m1();

        StaticExample staticExample = new StaticExample();
        staticExample.m3();

    }


}
