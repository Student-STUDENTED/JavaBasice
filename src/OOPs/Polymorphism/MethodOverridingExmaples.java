package OOPs.Polymorphism;


class Animals{

    void move(){
        System.out.println("Animals can move ");
    }
}
class Dog extends Animals{

    void move(){
        System.out.println("Dogs can walks");
    }
}
public class MethodOverridingExmaples {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.move();
    }

}
