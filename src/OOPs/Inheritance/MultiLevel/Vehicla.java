package OOPs.Inheritance.MultiLevel;

public class Vehicla {

    String brand;
    public void dispalybrand(){
        System.out.println("Brand : " + brand);
    }
}

class Car extends Vehicla{

    int speed;
    public void dispalySpeed(){
        System.out.println("Speed : " +speed + " km/h");
    }
}

class ElectricCar extends Car{
    int battery;

    public void batteryCapacity(){
        dispalybrand();
        dispalySpeed();
        System.out.println("Battery : " +battery);
    }
}

class Program4{
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();

        electricCar.brand = "Tata motors";
        electricCar.speed = 80;
        electricCar.battery = 40;

//        electricCar.dispalybrand();
//        electricCar.dispalySpeed();
        electricCar.batteryCapacity();

    }
}
