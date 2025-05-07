package Constructor;

class Animal{

    Animal(String name){
        System.out.println("Animal constructor is : " +name);
    }

}

class Dog extends Animal{

    Dog(){
        super("Dog");
        System.out.println("Dog constructor called");
    }
}
public class ConstructorSuper1 {

    public static void main(String[] args) {
        Dog dogs = new Dog();
        //Animal animal = new Animal("Dog");

    }
}
