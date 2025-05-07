package Constructor;


class Person{

    Person(String name){
        System.out.println("person name is " + name);
    }

}
class Employee extends Person{

    Employee(String name , int id){
        super(name);
        System.out.println("Employee id is " +id);
    }

}
public class ConstructorSuper2 {
    public static void main(String[] args) {

        Employee employee = new Employee("xyz", 102);
    }
}
