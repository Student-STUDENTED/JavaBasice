package Java8.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {

        List<String> string = Arrays.asList("Red", "Yellow", "Pink", "Black");

        System.out.println("Upper case : ");
         string.stream()
                .map(n-> n.toUpperCase())
                 .forEach(n-> System.out.println(n));


        System.out.println("Lower case : ");
        string.stream()
                .map(n -> n.toLowerCase())
                .forEach(n-> System.out.println(n));






        // no stream used
        List<String> uppercase = new ArrayList<>();
        for (String s1 : string){
            uppercase.add(s1.toUpperCase());
        }
        System.out.println("Upper case : " +uppercase);

        List<String> lowercase = new ArrayList<>();
        for(String s2 : string){
            lowercase.add(s2.toLowerCase());
        }
        System.out.println("Lower case : " +lowercase);



    }
}
