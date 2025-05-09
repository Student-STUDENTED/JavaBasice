package Java8.StreamRealTimeProblems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class oldestEmployee {

    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();


        Optional<EmployeeClass> employee = employeeList.stream()
                .max(Comparator.comparing(e -> e.getAge()));

        EmployeeClass employees = employee.get();

        System.out.println("Name : " +employees.getName());
        System.out.println("age : " +employees.getAge());
        System.out.println("Departement : " +employees.getDepartment());




        EmployeeClass oldest = employeeList.stream()
                .reduce((s1, s2) -> s1.getAge() > s2.getAge() ? s1 : s2)
                .get();
        System.out.println(oldest.getName());
        System.out.println(oldest.getAge());
        System.out.println(oldest.getDepartment());
    }

}
