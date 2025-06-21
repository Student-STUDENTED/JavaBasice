package StringClass;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private final String empName;
    private final int age;
    private final Addresss addresss;

    private final List<String> phoneNumber;

    public Employees(String empName, int age, Addresss addresss, List<String> phoneNumber) {
        this.empName = empName;
        this.age = age;
        this.addresss = addresss;
        this.phoneNumber = phoneNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    // clone the address object
    public Addresss getAddresss() throws CloneNotSupportedException{
        return (Addresss) addresss.clone();
    }

    // copy the list of phoneNumber
    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", address=" + addresss +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

final class Addresss implements Cloneable{
    private  String street;
    private String city;

    public Addresss(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Addresss clone() throws CloneNotSupportedException{
        return (Addresss) super.clone();
    }
    

    @Override
    public String toString() {
        return "Addresss{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Addresss addresss = new Addresss("street 1" , "city x");

        List<String> list = new ArrayList<>();
        list.add("2344");
        list.add("1122");

        // Declare the employee
        Employees employees = new Employees("abc", 29, addresss, list);
        System.out.println("Original employee details : " +employees);

        employees.getAddresss().setStreet("street 2");
        employees.getAddresss().setCity("city 2");

        System.out.println("change the employee address : " +employees.getEmpName());
        System.out.println(employees.getAge());
        System.out.println(employees.getAddresss());
        System.out.println(employees.getPhoneNumber());
    }

}
