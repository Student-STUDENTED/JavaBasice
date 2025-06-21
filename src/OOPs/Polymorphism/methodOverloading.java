package OOPs.Polymorphism;

class Addition{

    void add(int a, int b){
        int x = a + b;
        System.out.println("Sum of two number : " +x);
    }

    void add(int a, int b, int c){
        int y = a + b + c;
        System.out.println("Sum of three number : " +y);
    }
}
public class methodOverloading {

    public static void main(String[] args) {

        Addition addition = new Addition();
        addition.add(2, 5);
        addition.add(2, 4 , 8);

    }

}
