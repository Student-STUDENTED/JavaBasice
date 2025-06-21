package Constructor;



class  Construct{

    public void show(){
        System.out.println("Good");
    }

    Construct(){
        System.out.println("Working");
    }
}


public class Exmaple {
    public static void main(String[] args) {

        System.out.println("Hii");
        Construct c = new Construct();
        c.show();
        System.out.println("bye");
    }
}
