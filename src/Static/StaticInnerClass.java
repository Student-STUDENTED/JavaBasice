package Static;

public class StaticInnerClass {

    static int a = 20;
    int b = 10;

    static class Inner{

        void m1(){
            System.out.println(a);
            System.out.println("inner class");

        }

        public static void m2(){
            System.out.println(a);
            System.out.println("inner class of method m2");

        }
    }

    public static void main(String[] args) {
        System.out.println(StaticInnerClass.a);

        StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
        obj.m1();
    }
}
