package StringClass;


public class Immutable {

}

final class Employee{  // Immutable class

    private final String empName;
    private final int age;
    private final Address address;

    public Employee(String empName, int age, Address address) {
        super();
        this.empName = empName;
        this.age = age;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address address1 = new Address("Street 1",  "city 1");


        // create employee
        Employee employee = new Employee("abc", 23, address1 );

        System.out.println("Original employee object is : " +employee);

        address1.setCity("pune city");

        System.out.println("After modifying employee object is : " +employee);

    }
}

class Address{   // Mutable class
    private String street;
    private String city;

    public Address(String street, String city) {
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

     @Override
     public String toString() {
         return "Address{" +
                 "street='" + street + '\'' +
                 ", city='" + city + '\'' +
                 '}';
     }
 }
