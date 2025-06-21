package StringClass;

public class RegionMatchBetweenString {

    public static void main(String[] args) {

        String str1 = "java programming";

        String str2 = "java";
        System.out.println(str2.length());

        boolean b = str1.regionMatches(0, str2, 0, 4 );
        System.out.println(b);
    }
}
