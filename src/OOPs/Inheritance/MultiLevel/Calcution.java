package OOPs.Inheritance.MultiLevel;

public class Calcution {

    int a ;
    int b;

    public void calcutate(){
        System.out.println("Calculation : ");
        System.out.println("a : " +a);
        System.out.println("b : " +b);
    }
}

class Add extends Calcution{
    public int add(){
        return a +b;
    }
}

class Substrat extends Add{
    public int sub(){
        return a - b;
    }
}

class Program3{
    public static void main(String[] args) {
        Substrat r = new Substrat();

        r.a = 4;
        r.b = 8;

        r.calcutate();
        int addition = r.add();
        int subtrate = r.sub();

        System.out.println("Addition : " +addition);
        System.out.println("Subtraction : " +subtrate);
    }
}
