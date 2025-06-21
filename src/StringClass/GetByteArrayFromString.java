package StringClass;

public class GetByteArrayFromString {

    public static void main(String[] args) {

        String str = "This is sample String";

        byte[] arr = str.getBytes();

        String str1 = new String(arr);

        System.out.println(str1);
    }
}
