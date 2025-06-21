package OOPs.Inheritance.SingleInheritance;

public class Shape {

    public void area(){
        System.out.println("Calcutate the area");
    }
}

class Circle extends Shape{

    double radius;

    public void radius(){
        System.out.println("Radius of circle : " +radius);
    }

    public double calcurateArea(){
        area();
        return 3.14 * radius * radius;
    }
}

class Programe5{

    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.radius = 3.0;

        double result = circle.calcurateArea();
        System.out.println(result);
    }
}
