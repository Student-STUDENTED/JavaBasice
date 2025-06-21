package OOPs.Inheritance.SingleInheritance;

public class Employee {
    String name;
    int employeeId;

    public void employeeDetail(){

        System.out.println("Name : " +name);
        System.out.println("Employee ID : " +employeeId);
    }
}

class Manager extends Employee{
    String deparatment;

    public void dispalyManager(){
        System.out.println("Department : " +deparatment);
    }
}

class Program3{
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.name = "abc";
        manager.employeeId = 102;
        manager.deparatment= "chemisty department";

        manager.employeeDetail();
        manager.dispalyManager();
    }
}
