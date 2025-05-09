package Java8.StreamRealTimeProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeOfMaleAndFemale {

    public static void main(String[] args) {

        List<EmployeeClass> employeeClasses = EmployeeClass.getEmployee();

        Map<String, Double> average = employeeClasses.stream()
                .collect(Collectors.groupingBy(e -> e.getGender(),
                        Collectors.averagingInt(e -> e.getAge())));

        System.out.println(average);




    }
}
