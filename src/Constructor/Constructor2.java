package Constructor;

public class Constructor2 {

    Constructor2(){
        System.out.println("No - argument constructor");
    }

    Constructor2(int a, int b){
        System.out.println("Parameterized constructor");
    }


    public static void main(String[] args) {
        Constructor2 constructor2 = new Constructor2();

        Constructor2 c = new Constructor2(10, 10);
    }
}
