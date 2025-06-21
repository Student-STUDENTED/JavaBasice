package OOPs.Inheritance.HybridInheritance;

public class Human {

    String name;
    int age;

    public void show(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}
class Teacher extends Human{
    String subject;

    public void subject(){
        System.out.println("Subject : " +subject);
    }
}
class Researcher{

    public void publishpaper(){
        System.out.println("Publich researche paper on NanoParticles systhesis.");
    }
}
class Program3{
    public static void main(String[] args) {

        Teacher t = new Teacher();
        Researcher r =  new Researcher();

        t.name = "xyz";
        t.age = 34;
        t.subject = "Chemistry";
        t.show();
        t.subject();
        r.publishpaper();

    }


}


