package Static;

public class Counter {

     static int a = 0;

    Counter(){
        a++;
    }

    void show(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        counter1.show();

        Counter counter2 = new Counter();
        counter2.show();

        Counter counter3 = new Counter();
        counter3.show();
    }
}
