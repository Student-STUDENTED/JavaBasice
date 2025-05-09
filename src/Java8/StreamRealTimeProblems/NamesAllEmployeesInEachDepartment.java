package Java8.StreamRealTimeProblems;

import OOPs.Abstraction.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesAllEmployeesInEachDepartment {

    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();

        Map<String, List<EmployeeClass>> nameOfEmployeeInEachDepartement = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment()));

        for (Map.Entry<String, List<EmployeeClass>> entry : nameOfEmployeeInEachDepartement.entrySet()) {

            System.out.println("Enployee in : " + entry.getKey() + " : ");

            for (EmployeeClass e : entry.getValue()) {
                System.out.println(e.getName());
            }
        }
    }
}
