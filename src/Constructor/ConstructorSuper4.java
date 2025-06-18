package Constructor;


class ConstructorParent{


}
class ConstructorChild extends ConstructorParent{

    ConstructorChild(){
        System.out.println("child default constructo");
    }
}
public class ConstructorSuper4 {
    public static void main(String[] args) {

        ConstructorChild child = new ConstructorChild();
    }

}
