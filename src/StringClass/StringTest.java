package StringClass;

public class StringTest {

    public static void main(String[] args) {

        String s1 = new String("java");   //heap

        String s2 = new String("java");   // heap

        String t1 = "java";
        String t2 = "java";

        System.out.println(s1 == s2);   // false
        System.out.println(s1.equals(s2));  //true

        boolean r1 = s1.equals(t2);
        boolean r2 = t1 == t2;
        boolean r3 = (s1 == t1);
        boolean r4 = (s1 == s2);

        System.out.println("Result r1 : " +r1); // true
        System.out.println("Result r2 : " +r2); // true
        System.out.println("Result r3 : " +r3);  // false
        System.out.println("Result r4 : " +r4); // false

//        String s="a";
//        String st= "b";
//        System.out.println(s);
//        System.out.println(st);

        String s3 = "java programe";   // scp
        String s4 = t1.concat("programe");  //heap
        System.out.println(s3 == s4);   // false

        String s5 = "java";  // scp
        String s6 = s1.toUpperCase(); // heap
        System.out.println(s5 == s6); //false

    }
}

