package StringClass;

public class LexicographicalStringComparison {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        int result = str1.compareTo(str2);

        if (result < 0){
            System.out.println(str1 + " is less than " + str2);
        }
        else if(result > 0){
            System.out.println(str1 + " is greater than " + str2);
        }
        else if (result == 0){
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}
