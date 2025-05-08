package Java8.Lambdaexpression;


interface Concatenate{

    String concate(String s1, String s2);
}
public class ConcatenateTwoString {

    public static void main(String[] args) {

        Concatenate concatenate = ((s1, s2) -> s1 + " " + s2);

        String str1 = "Good";
        String str2 = "Morning";

        System.out.println(concatenate.concate(str1, str2));
    }
}
