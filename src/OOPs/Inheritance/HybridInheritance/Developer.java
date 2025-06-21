package OOPs.Inheritance.HybridInheritance;


public class Developer {
    public void developer(){
        System.out.println("Software application development.");
    }

}

class BackendDeveloper extends Developer {
    void backend(){
        System.out.println("Using Backend technologies like Spring boot, JDCB");
    }
}
class DatabaseExpert {
    public void databaseSkill(){
        System.out.println("Skilled in SQL and database management");
    }
}

class FullBackendDeveloper extends  BackendDeveloper{
    DatabaseExpert d = new DatabaseExpert();
     void show(){
         developer();
         backend();
         d.databaseSkill();
     }
}

class Program2{
    public static void main(String[] args) {

        FullBackendDeveloper f = new FullBackendDeveloper();
        f.show();
    }
}

