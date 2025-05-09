package Java8.StreamRealTimeProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryOfMaleAndFemale {

    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();

        Map<String , Double> averageSalary = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getGender(),
                        Collectors.averagingDouble(e -> e.getSalary())));

        System.out.println(averageSalary);

    }
}
