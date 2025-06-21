package Loops.Exercises;

public class NumberOfWord {
    public static void main(String[] args) {

        String str = "Count total number of word in a string";

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' '){
                count++;
            }
        }
        System.out.println("Total number of word : " +count);





        //String str = "Count total number of word in a string";
//        String[] s = str.split(" ");
//        int count = s.length;
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//
//        }
//        System.out.println("Total number of word : " +count);


    }
}
