package Exception_Handling;

public class TryCatchCase4 {

    public static void main(String[] args) {

        System.out.println("Statement 1");

        try{

            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (Exception e){
            TryCatchCase4 tryCatchCase4 = null;
            tryCatchCase4.show();
        }

        System.out.println("Statement 5");
        System.out.println("Normal termination of program");
    }

    void show(){
        System.out.println("Satement 4");
    }
}
