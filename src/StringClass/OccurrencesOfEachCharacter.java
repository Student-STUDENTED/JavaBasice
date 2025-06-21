package StringClass;

public class OccurrencesOfEachCharacter {

    public static void main(String[] args) {

        String str = "abcdabcdab";

        int[] characterCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
           characterCount[str.charAt(i)]++;
        }

        for (int i = 0; i < characterCount.length; i++) {
            if (characterCount[i] > 0){
                System.out.println( (char) i+ " : " +characterCount[i]);
            }
        }




        boolean[] duplicateChar = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (duplicateChar[i]) continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                    duplicateChar[j] = true;
                }
            }
            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
