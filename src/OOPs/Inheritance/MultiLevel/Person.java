package OOPs.Inheritance.MultiLevel;

public class Person {
    public String name ;
    public int age;

    public void dispalyPerson(){
        System.out.println("Name : " + name);
        System.out.println("age : " +age);
    }
}

class Employee extends Person{
    int employeeId;

   public void  dispalyEmployee(){
       System.out.println("Employee id : " +employeeId);
   }
}

class Manager extends Employee{
    String department;

    public void dispalymanager(){
        System.out.println("department : " +department);
    }
}

class Program1{
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.name = "xyz";
        manager.age = 34;
        manager.employeeId = 111;
        manager.department = "Finance";

        manager.dispalyPerson();
        manager.dispalyEmployee();
        manager.dispalymanager();
    }
}