package Loops;

public class Problems {
    public static void main(String[] args) {
        int n = 10;

        // Print all natuarl number from 1 to n.
        System.out.print("Print n th natural numbers : " );
        for (int i = 1; i <= n; i++) {
            System.out.print( i + " ");
        }

        //Print all natutal number in reverse order.
        System.out.print("\nPrint n th natural number in reverse order : ");
        for (int i = n; i >= 1; i--) {
            System.out.print( i + " ");
        }

        //Print tables
        System.out.println("\nPrint the tables of given number : ");
        int x = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i) );
        }

        //Print the reverse tables.
        System.out.println("\nPrint the reverse tables : ");
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(x + " * " + i + " = " + (x * i));

        }

        // Print all alphabetls from a to z.
        System.out.print("\nPrint all alphabets : ");
        for (char i = 'a' ; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        // Print all alphabets in reverse order from z to a.
        System.out.print("\nPrint reverse alphabets : ");
        for (char i = 'z'; i >= 'a' ; i--) {
            System.out.print(i + " ");
        }

        // Print all even number between from 1 to 100.
        System.out.print("\n\nPrint even number : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Print odd number between from 1 to 100.
        System.out.print("\nPrint odd number : ");
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }

        // Print sum of natural numbers between 1 to n.
        int sum = 0;
        // n = 10;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("\n\nSum of natural number : " +sum);

        // Print sum of even number between 1 to n.
        int total = 0;
        for (int i = 0; i <= n ; i++) {
            if (i % 2 == 0){
                total += i ;
            }
        }
        System.out.print("Total even number : " +total);
    }
}
