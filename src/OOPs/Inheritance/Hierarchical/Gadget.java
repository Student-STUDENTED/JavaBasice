package OOPs.Inheritance.Hierarchical;

public class Gadget {

    String brand;
    double price;

    void showDetails(){
        System.out.println("Brand name : " +brand);
        System.out.println("price : " +price);
    }
}

class Phone extends Gadget{

    void  call(){
        System.out.println(brand +" Phone is used to communicate with others");
    }
}

class Laptop extends Gadget{

    void study(){
        System.out.println(brand + " Laptop is used to browsing the internet, creating documents");
    }
}

class Program5{
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.brand = "oppo";
        phone.price = 10000;
        System.out.println("Phone Details = ");
        phone.showDetails();
        phone.call();
        System.out.println();

        Laptop laptop = new Laptop();
        laptop.brand= "Hp";
        laptop.price = 30000;
        System.out.println("Laptop Details = ");
        laptop.showDetails();
        laptop.study();
        System.out.println();


    }
}
