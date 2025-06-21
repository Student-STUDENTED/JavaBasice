package StringClass;

import java.util.Scanner;

public class StringContainsSpecifiecSquence {

    public static void main(String[] args) {

        String str = "Java is programming language";
        System.out.println(str);

        System.out.print("Specific character : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(str.contains(s));


    }
}
