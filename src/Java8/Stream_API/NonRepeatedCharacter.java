package Java8.Stream_API;



public class NonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "java Concept of the day";


        String s = str.chars()
                .distinct()
                .mapToObj(i -> String.valueOf((char) i))
                .findFirst().get();


        System.out.println(s);
    }
}
