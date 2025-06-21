package Static;

class Test{
    static int a = 10;
    static  int b = 20;

    static {
        a = 50;
    }
    void m1(){
        b = 2;
    }
}

class Test1{

    void calculation() {
        int c = Test.a;
        int d = Test.b;

        int result = c + d;
        System.out.println(result);
    }
}
public class AccessStaticVariablefromAnotherclass {
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.calculation();
        System.out.println(Test.a);
        System.out.println(Test.b);

    }
}
