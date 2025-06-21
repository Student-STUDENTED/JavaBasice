package OOPs.Inheritance.SingleInheritance;

public class Person {
    String name;
    int age;
    public void dispalyDetails(){

        System.out.println("Name : " +name);
        System.out.println("age : " +age);
    }
}

class Student extends Person{
    int rollNumber;

    public void dispalyStudentDetails(){
        dispalyDetails();
        System.out.println("Roll number : " +rollNumber);
    }
}

class Program2{
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "xyz";
        student.age = 24;
        student.rollNumber = 102;

        //student.dispalyDetails();
        student.dispalyStudentDetails();
    }
}
