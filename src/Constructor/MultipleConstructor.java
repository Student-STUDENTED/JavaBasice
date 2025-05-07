package Constructor;


class Parent{

    Parent(){
        System.out.println("Parent class constructor");
    }

}
class Child extends Childclass{

    Child(){
        System.out.println("Child class constructor");
    }
}

class Childclass extends Parent{

    Childclass(){
        System.out.println("Childclass class constructor");
    }
}
public class MultipleConstructor {
    public static void main(String[] args) {

      //  Childclass childclass = new Childclass();

        Child child = new Child();


    }
}
