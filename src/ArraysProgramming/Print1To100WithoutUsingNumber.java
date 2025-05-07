package ArraysProgramming;

public class Print1To100WithoutUsingNumber {


    public static void main(String[] args) {

        String start = "*";
        String end = "**********";

        for (int i = start.length(); i <= end.length() * end.length(); i++) {
            System.out.println(i);
        }
    }
}
