package StringClass;


import java.util.Objects;

public class HashcodeMethod {

    int a ;
    String str;

    public HashcodeMethod(int a, String str){
        this.a = a;
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        HashcodeMethod h = (HashcodeMethod) o;
        boolean isEqual = this.a == h.a &&
                this.str.equals(this.str);
        return isEqual;
    }

//    @Override
//    public int hashCode() {
//        return 11;
//    }

    public static void main(String[] args) {



        String s1 = "java";
        String s2 = "java";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String str1 = new String("java");
        String str2 = new String("java");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        HashcodeMethod h1 = new HashcodeMethod(1, "java");
        HashcodeMethod h2 = new HashcodeMethod(1, "java");

        System.out.println(h1.hashCode());
        System.out.println(h1.hashCode());


        System.out.println(h1 == h2);
        System.out.println(h1.equals(h2));




    }

}
