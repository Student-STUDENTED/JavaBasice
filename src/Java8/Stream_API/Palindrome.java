package Java8.Stream_API;



import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Palindrome {

    public static void main(String[] args) {

        String str  = "rotator";

        boolean palindrom = IntStream.rangeClosed(0, str.length()/2 )
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 - i));
        System.out.println(palindrom);




        String rev = new StringBuilder(str).reverse().toString();
        if (rev.equals(str)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
