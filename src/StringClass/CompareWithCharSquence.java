package StringClass;

public class CompareWithCharSquence {

    public static void main(String[] args) {

        String str1 = "example.com";
        String str2 = "Example.com";

        String cs = "example.com";

        System.out.println(str1.contentEquals(cs));
        System.out.println(str2.contentEquals(cs));
    }
}
