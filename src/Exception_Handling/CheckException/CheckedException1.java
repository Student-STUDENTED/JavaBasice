package Exception_Handling.CheckException;

public class CheckedException1 {


    public static void main(String[] args) {

        try {
            Class mclass = Class.forName("Exception_Handling.CheckException.CheckedException11");
            CheckedException1 checkedException1 = (CheckedException1) mclass.newInstance();
            checkedException1.show();

        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
            System.out.println("class not found exception ");
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);

        }

    }
    void show(){
        System.out.println("show method");
    }
}
