package OOPs.Inheritance.MultiLevel;

public class Animal {
    public void eat(){
        System.out.println("Animal eats food");
    }
}

class Mammals extends Animal{
    public void breathe(){
        System.out.println("Mammals breathe air");
    }
}

class Dog extends Mammals{
    public void bark(){
        System.out.println("Dogs bark , woof-woof");
    }
}

class Program2{
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.breathe();
        dog.bark();
    }
}