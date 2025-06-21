package OOPs.Abstraction;

public abstract class Employee {

    // static variable can be initialize easily
    // non static variable must be initialized through a constructor

    String name;
    int id;

    // constructor
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    // declaretion of concrete method
     void method(){
        System.out.println("Name : " +name);
        System.out.println("id : " + id);
    }
}

class Engineer extends Employee{

    public Engineer(String name , int id){
        super(name,id);   // super keyword calls super class constructor
    }


    public static void main(String[] args) {

        Engineer engineer = new Engineer("xyz", 102);
        engineer.method();
    }
}

