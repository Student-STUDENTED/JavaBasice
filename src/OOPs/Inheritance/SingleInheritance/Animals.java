package OOPs.Inheritance.SingleInheritance;

public class Animals {

    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}
class Cat extends Animals {

    public void catSound() {
        System.out.println("The cat meows");
    }

}

class Program1{
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.makeSound();
        cat.catSound();
    }
}
