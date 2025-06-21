package Loops.Exercises;

public class PrintASCIIvalues {

    public static void main(String[] args) {

        for (int i = 1; i <= 255; i++) {

            System.out.println("ASCII " + i + " : "+(char) i);

        }
    }
}
