package Exception_Handling;

public class TryCatchCase5 {

    public static void main(String[] args) {

        System.out.println("Statement 1");

        try{
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (Exception e){
            System.out.println("Statement 4");
        }

        int result = 100 / 0;
        System.out.println("Statement 5");

        System.out.println("Abnormal termination of program");
    }
}
