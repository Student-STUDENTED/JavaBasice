package OOPs.Inheritance.Hierarchical;

public class Company {

    void companyName(){
        System.out.println("Company name is xyz");
    }
}

class Employee1 extends Company{

    void employee1Name(){
        System.out.println("EmployeeName1 is abc");
    }
}

class Employee2 extends Company{

    void employee2Name(){
        System.out.println("EmployeeName2 is efg");
    }
}

class Employee3 extends Company{

    void employee3Name(){
        System.out.println("EmployeeName3 is pqr");
    }
}

class Program3{

    public static void main(String[] args) {
        Employee1 employee1 = new Employee1();
        employee1.companyName();
        employee1.employee1Name();
        System.out.println();

        Employee2 employee2 = new Employee2();
        employee2.companyName();
        employee2.employee2Name();
        System.out.println();

        Employee3 employee3 = new Employee3();
        employee3.companyName();
        employee3.employee3Name();
        System.out.println();

    }
}
