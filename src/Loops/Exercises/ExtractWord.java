package Loops.Exercises;

public class ExtractWord {

    public static void main(String[] args) {


        String str = "java is powerful";

        String[] s = str.split(" ", 3);

        for (int i = 0; i < s.length; i++) {

            System.out.println(s[i]);
        }



      /*  String word = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' '){
                word += str.charAt(i);
            }
            else {
                if (!word.isEmpty()){

                    System.out.println(word);

                    word= "";
                }
            }
        }
        if (!word.isEmpty()){
            System.out.println(word);
        }

       */
    }
}
