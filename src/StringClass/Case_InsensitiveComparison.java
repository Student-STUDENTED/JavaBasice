package StringClass;

public class Case_InsensitiveComparison {

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "JavA";

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0){
            System.out.println(str1 + " is less than " + str2);
        }
        else if (result > 0){
            System.out.println(str1 + " is greater than " +str2);
        }
        else if (result == 0){
            System.out.println(str1 + " is equal to " +str2);
        }
    }
}
