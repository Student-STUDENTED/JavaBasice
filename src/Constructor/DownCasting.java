package Constructor;

class sport{

    void display(){
        System.out.println("Sport");
    }

}
class  cricket extends sport{

    void dispaly(){
        System.out.println("Cricket");
    }
}

public class DownCasting {
    public static void main(String[] args) {

//        cricket c = (cricket) new sport();
//        c.dispaly();  // runtime exception

        sport s = new cricket();
        cricket c = (cricket) s;
        c.dispaly();


    }
}
