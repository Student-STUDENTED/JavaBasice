package Exception_Handling.CheckException;

public class CheckedException5 {

    private CheckedException5(){

    }

}

class Access{
    public static void main(String[] args) {

       try {

//           Class myclass = Class.forName(CheckedException5);
//           CheckedException5 checkedException5 = (CheckedException5) myclass.newInstance();
           CheckedException5 checkedException5 = CheckedException5.class.newInstance();
           System.out.println(checkedException5);

       }catch (IllegalAccessException e){
           System.out.println(e.getMessage());
           System.out.println(e.getCause());
       }catch (InstantiationException e){
           System.out.println(e.getMessage());
       }
    }
}
