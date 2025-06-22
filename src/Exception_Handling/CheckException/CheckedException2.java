package Exception_Handling.CheckException;

public abstract class CheckedException2 {

    abstract void show();
}

class Main{
    public static void main(String[] args) {


        try {
            Class c = Class.forName("Exception_Handling.CheckException.CheckedException2");
            CheckedException2 checkedException2 = (CheckedException2) c.newInstance();
            checkedException2.show();

        }catch (InstantiationException ie){
            System.out.println(ie.getMessage());
            System.out.println("Instantiation exception");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
