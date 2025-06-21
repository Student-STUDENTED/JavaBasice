package StringClass;

public class EqualsAndEqualOperaterMethod {

    public static void main(String[] args) {

        String s1 = new String("java");
        String s2 = "java";

        boolean equalsMethod = s1.equals(s2);
        System.out.println("Using equal method : " +equalsMethod);  //true

        boolean equalsOperator = s1 == s2;
        System.out.println("Using equal operators : " +equalsOperator); //false


        // bydefault check the reference of object
        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        boolean result = sb1.equals(sb2);

        System.out.println(result); // false
    }
}
