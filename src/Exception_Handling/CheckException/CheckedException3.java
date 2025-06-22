package Exception_Handling.CheckException;

public class CheckedException3 {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            String CheckedException3 = "";
            Class c = Class.forName(CheckedException3);
        } catch (ClassNotFoundException e){
            System.out.println("class not foune : " +e.getMessage());
            System.out.println(e.getCause());
        }
    }

}