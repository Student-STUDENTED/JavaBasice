package Loops.Exercises;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "Hello World";
        str = str.toLowerCase();
        int count = 0;

        // Array to track used letter.
//        boolean[] used = new boolean[26];
//
//        for (int i = 0; i < str.length(); i++) {
//
//            int ch = str.charAt(i);
//
//            if (ch >= 'a' && ch <= 'z'){
//                int index = ch - 'a';
//
//                if (!used[index]){
//                    used[index]= true;
//                    count++;
//                    System.out.println((char)ch + " ");
//                }
//            }
//        }
//        System.out.println("Total number of unique character : " +count );






       /* for (int i = 'a'; i < 'z'; i++) {

            for (int j = 0; j < str.length(); j++) {

                if (i == str.charAt(j)){
                    System.out.println((char) i + " ");
                    count++;
                    break;
                }
            }
        }
        System.out.println("total number of character : " +count);

        */








        String found = "";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i)) && found.indexOf(str.charAt(i)) == -1){

                found += str.charAt(i);
                count++;
                System.out.println(str.charAt(i));

            }
        }
        System.out.println("length : " +count);



    }
}
