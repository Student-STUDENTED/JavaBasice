package OOPs.Inheritance.HybridInheritance;

public class GrandMother {

    void grandMother(){
        System.out.println("She is grandmother.");
    }
}

class Mother extends GrandMother{

    public void mother(){
        System.out.println("She is mohter.");
    }
}

class Daughter extends Mother{

    public void daughter(){
        System.out.println("She is daughter.");
    }
}

class Son extends Mother{

    public void son(){
        System.out.println("He is son");
    }
}

class Program1{
    public static void main(String[] args) {

        Daughter daughter = new Daughter();
        daughter.grandMother();
        daughter.mother();
        daughter.daughter();

        Son son = new Son();
        son.grandMother();
        son.mother();
        son.son();

    }
}
