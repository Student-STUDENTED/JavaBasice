package Java8.StreamRealTimeProblems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeesDetails {

    public static void main(String[] args) {

        List<EmployeeClass> employeeClasses = EmployeeClass.getEmployee();


        Optional<EmployeeClass> highestPaidEmployee =
                employeeClasses.stream().max(Comparator.comparingDouble(e -> e.getSalary()));
        System.out.println(highestPaidEmployee);




        Optional<EmployeeClass> highestPaidEmployees = employeeClasses.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())));
        System.out.println(highestPaidEmployee);

    }
}
