package StringClass;

public class CompareWithStringBuffer {

    public static void main(String[] args) {

        String str1 = "Example.com";
        String str2 = "example.com";

        StringBuffer sb = new StringBuffer("example.com");

        System.out.println(str1.contentEquals(sb));
        System.out.println(str2.contentEquals(sb));

    }
}
