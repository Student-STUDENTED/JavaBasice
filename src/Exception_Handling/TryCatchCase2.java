package Exception_Handling;

public class TryCatchCase2 {


    public static void main(String[] args) {

        try{
            System.out.println("Statement 1");
            int a = 10/0;    // runtime Exception
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (ArithmeticException e){
            System.out.println("Statement 4");
        }

        System.out.println("Statement 5");

        System.out.println("Normal termination of program");
    }
}
