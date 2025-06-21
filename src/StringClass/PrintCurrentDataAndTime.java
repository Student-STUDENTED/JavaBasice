package StringClass;

import java.util.Calendar;

public class PrintCurrentDataAndTime {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println();

        System.out.printf("%tB %te, %ty%n ", calendar, calendar, calendar);

        System.out.printf("%t1:%tM %tp%n", calendar, calendar, calendar);
    }
}
