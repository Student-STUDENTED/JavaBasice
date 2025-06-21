package OOPs.Inheritance.Hierarchical;

public class Person {

    String name;
    int age;
    public void personDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " +age);
    }
}

class Student extends Person{

    String course;

    public void studentDetail(){
        personDetails();
        System.out.println("Cousrse :  " +course);
    }
}

class Teacher extends Person{
    String subject;

    public void teacherDetail(){
        personDetails();
        System.out.println("Subject : " +subject);
    }
}

class Program1{
    public static void main(String[] args) {

        Student student =new Student();
        student.name = "xyz";
        student.age = 25;
        student.course = "Computer";

        student.studentDetail();

        Teacher teacher = new Teacher();
        teacher.name = "abc";
        teacher.age = 34;
        teacher.subject = "computer";

        teacher.teacherDetail();
    }
}