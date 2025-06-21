package StringClass;

public class GetCharArrayFromString {

    public static void main(String[] args) {

        String str = "This is sample string";

        char[] charArr = str.toCharArray();

        for (char i = 0; i < charArr.length; i++) {

            System.out.print(charArr[i]);
        }

    }
}
