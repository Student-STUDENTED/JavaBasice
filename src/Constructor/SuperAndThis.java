package Constructor;


class ParentClass{

    ParentClass(int i){
        this();
        System.out.println("No-argument constructor of parentclass");
    }
    ParentClass(){
        System.out.println("constructor");
    }

}

class ChildClas extends ParentClass{

    ChildClas(int a, int b){
        super(30);
        System.out.println("No-argument constructor of childclass");
    }

}

public class SuperAndThis {

    public static void main(String[] args) {

        ChildClas childClass = new ChildClas(10, 10);
    }
}
