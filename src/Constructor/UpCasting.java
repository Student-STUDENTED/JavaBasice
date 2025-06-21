package Constructor;

class Sport{

    public void display(){
        System.out.println("Sport");
    }
    public void displayName(){
        System.out.println("sport");
    }
}

class Cricket extends Sport{

    public void displayName(){
        System.out.println("Cricket");
    }
    public void m(){
        System.out.println("m");
    }
}

public class UpCasting {

    public static void main(String[] args) {

        Sport sport = new Cricket();
        sport.display();
        sport.displayName();
        //sport.m();

//        Cricket cricket =new Cricket();
//        cricket.display();
//        cricket.displayName();
    }
}
