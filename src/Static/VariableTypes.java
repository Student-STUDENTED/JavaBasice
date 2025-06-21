package Static;

public class VariableTypes {

    int instance = 10;   // instance variable
    static int salary = 1;    // static variable
    int instanceLocalValue;

    void test(){
        int local = 2 ;  // Local variable
        System.out.println("Local variable value : " +local);
    }

    void setLocalValue(){
        instanceLocalValue = 1;
        System.out.println("set the local variable value : " + instanceLocalValue);

    }





    public static void main(String[] args) {
        VariableTypes v = new VariableTypes();
        System.out.println(v.instance);
        System.out.println(VariableTypes.salary);
        v.test();

        v.setLocalValue();


        VariableTypes obj1 = new VariableTypes();
        System.out.println(obj1.instance);
        System.out.println(VariableTypes.salary);

        VariableTypes obj2 = new VariableTypes();
        System.out.println(obj2.instance);
        System.out.println(VariableTypes.salary);



    }
}
