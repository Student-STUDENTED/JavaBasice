package StringClass;

public class EndsWithSubString {

    public static void main(String[] args) {

        String str = "java program";

        System.out.println(str.endsWith("am")); //true
        System.out.println(str.endsWith("pr")); //false
        System.out.println(str.endsWith("gram")); //true
    }
}
