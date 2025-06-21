package Static;

public class StaticExamples {

    static int values1 = 10;
    int values2 = 10;

    public static void main(String[] args) {

        StaticExamples obj1 = new StaticExamples();
        obj1.values1 = 20;
        obj1.values2 = 20;

        StaticExamples obj2 = new StaticExamples();
        obj2.values1 = 30;
        obj2.values2 = 30;

        System.out.println(obj1.values1);
        System.out.println(obj1.values2);

        System.out.println(obj2.values1);
        System.out.println(obj2.values2);

    }
}
