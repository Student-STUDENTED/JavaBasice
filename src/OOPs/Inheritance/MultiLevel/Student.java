package OOPs.Inheritance.MultiLevel;

public class Student {

    String name;
    int rollNo;

    public void studentDetails(){
        System.out.println("Name : " +name);
        System.out.println("Roll no . : " +rollNo);
    }
}

class StudentCollege extends Student{

    String course;
    String collegeName;

    public void collegeDetails(){
        System.out.println("Course : " +course);
        System.out.println("College Name : " + collegeName);
    }
}

class Hostel extends StudentCollege{

    String hostelName;
    int roomNo;

    public void hostelDetails(){
        System.out.println("Hostel Name : " +hostelName);
        System.out.println("Room No : " +roomNo);
    }
}

class Program5{
    public static void main(String[] args) {
        Hostel h = new Hostel();
        h.name = "xyz";
        h.roomNo = 303;
        h.course = "Computer Sicence";
        h.collegeName = "abc";
        h.hostelName = "fff";
        h.roomNo = 6;

        h.studentDetails();
        h.collegeDetails();;
        h.hostelDetails();
    }
}
