package Java8.Lambdaexpression;


interface Empty{

    boolean isEmpty(String s);
}
public class StringIsEmpty {

    public static void main(String[] args) {


        Empty empty = (s) -> s == null || s.trim().isEmpty();
        //s.trim().isEmpty handle whiteSpace only stirng

        String str = "";
        System.out.println(empty.isEmpty(str));
        String str1 = "  ";
        System.out.println(empty.isEmpty(str1));
        String str2 = "hs";
        System.out.println(empty.isEmpty(str2));
    }
}
