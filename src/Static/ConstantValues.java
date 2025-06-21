package Static;


class Employee{

    String name;
    int id;

    static String companyName = "kit kat";

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("Name : "+name+ ", "+ "Id : "+id + ", " + "CompanyName : " + companyName);
    }
}
public class ConstantValues {
    public static void main(String[] args) {

        Employee employee1 = new Employee("abc", 102);
        employee1.display();

        Employee employee2 = new Employee("xyz", 103);
        employee2.display();

    }
}
