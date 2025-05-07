package Constructor;

class ConstructorChainingParent{

    ConstructorChainingParent(){
        System.out.println("No- arg constructor");
    }
    ConstructorChainingParent(String name){
        System.out.println("Parent parameterized constructor with name : " +name);
    }
    ConstructorChainingParent(String name, int id){
        System.out.println("Parent parameterized constructor with name : "+name+ ", id : "+id);
    }

}
class ConstructorChainingChild extends ConstructorChainingParent{
    ConstructorChainingChild(){
        System.out.println("No- arg constructor of child");
    }
    ConstructorChainingChild(String name){
        super(name);
        System.out.println("Child parameterized constructor called with name : " +name);
    }
    ConstructorChainingChild(String name, int id){
        super(name, id);
        System.out.println("Child parameterized constructor with name : "+name+", id : "+id);
    }

}
public class ConstructorSuper3 {
    public static void main(String[] args) {

        //ConstructorChainingParent c = new ConstructorChainingParent("xyz", 101);

        ConstructorChainingChild child = new ConstructorChainingChild();
        ConstructorChainingChild child1 = new ConstructorChainingChild("xyz");
        ConstructorChainingChild child2 = new ConstructorChainingChild("abc", 100);

    }
}
