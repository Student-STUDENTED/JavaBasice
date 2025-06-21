package OOPs.Inheritance.Hierarchical;


public class VehicalPrice {

    double price = 10000;

    void showPrice(){
        System.out.println("The price of vehical is : " +price);
    }
}

class TwoWheeler extends VehicalPrice{

    double increasePriceBy = 2;  // time;

    void finalPrice(){
        price = price + (price * increasePriceBy);
        System.out.println("After, The price of bike is " +price);
    }

}
class FourWheeler extends VehicalPrice{

    double increasePriceBy = 1;

    void finalPriceCar(){
        price = price + (price * increasePriceBy);
        System.out.println("After, The price of car is : " +price);
    }
}

class Program4{
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        bike.showPrice();
        bike.finalPrice();

        FourWheeler car = new FourWheeler();
        car.showPrice();
        car.finalPriceCar();

    }
}


