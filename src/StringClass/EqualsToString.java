package StringClass;

public class EqualsToString {

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "Java";
        String str3 = "java";

        System.out.println(str1.equals(str2));  //false
        System.out.println(str1.equals(str3));  //true
        System.out.println(str1.equalsIgnoreCase("str2")); //true
    }
}
