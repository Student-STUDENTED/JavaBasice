package Constructor;

public class TypeCasting {

    public static void main(String[] args) {

        // widening type casting
        int i = 10;

        long l = i;

        double d = l;


        System.out.println(l);
        System.out.println(d);


        //Narrow type casting
        double a = 20.0;

        int b = (int) a;

        long c =(int) a;
        System.out.println(c);
        System.out.println(b);

    }
}
