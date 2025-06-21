package StringClass;

public class GetIndexOfAlphabetCharacter {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            int index = i - 'A';

            System.out.println(i +" : "+ index);

        }
    }
}
