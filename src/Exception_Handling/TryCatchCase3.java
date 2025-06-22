package Exception_Handling;

public class TryCatchCase3 {


    public static void main(String[] args) {

        System.out.println("Statement 1");

        try {
            TryCatchCase3 tryCatchCase3 = null;
            tryCatchCase3.show();
            System.out.println("Statement 3");

        } catch (ArithmeticException e) {
            System.out.println("Statement 4");
        }

        System.out.println("Statement 5");

        System.out.println("Abnormal termination of program");
    }

        void show(){
            System.out.println("Statement 2");
        }



}
