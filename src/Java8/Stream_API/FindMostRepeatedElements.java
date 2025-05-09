package Java8.Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class FindMostRepeatedElements {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Book");
        list.add("NoteBook");
        list.add("Book");
        list.add("Pen");
        list.add("Pencil");
        list.add("Book");


        Map.Entry<String, Long> l = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println(l.getKey());
        System.out.println(l.getValue());



        String freq = list.stream()
                .max(Comparator.comparing(e -> Collections.frequency(list, e)))
                .orElse(null);
        System.out.println(freq);







    }
}
