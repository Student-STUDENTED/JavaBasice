package OOPs.Inheritance.Hierarchical;


class Animal {
    String name;

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void eat() {
        System.out.println(name + " eats");
    }
}

class Dog extends Animal{
    public void dagMakeSound() {
        System.out.println(name + " barks : woof-woof");
    }
}

class Cat extends Animal {
    public void carMakeSound() {
        System.out.println(name + " meows : meow meow");
    }
}

class Hierarchicla1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Mote";
        dog.eat();
        dog.dagMakeSound();

        Cat cat = new Cat();
        cat.name = "manu";
        cat.eat();
        cat.carMakeSound();
    }
}
