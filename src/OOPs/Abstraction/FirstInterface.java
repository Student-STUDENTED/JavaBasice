package OOPs.Abstraction;

public interface FirstInterface {

    void firstMethod();
}

interface SecondInterface{

    void secondMethod();
}

class Democlass implements FirstInterface, SecondInterface{

    @Override
    public void firstMethod() {
        System.out.println("first method");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second method");
    }
}

class Main{
    public static void main(String[] args) {
        Democlass d = new Democlass();
        d.firstMethod();
        d.secondMethod();
    }
}
