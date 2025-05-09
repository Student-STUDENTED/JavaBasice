package Java8.StreamRealTimeProblems;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAndTotalSalary {

    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();


        DoubleSummaryStatistics salary = employeeList.stream()
                .collect(Collectors.summarizingDouble(e -> e.getSalary()));


        System.out.println("Total salary : " +salary.getSum());
        System.out.println("Average salary : " +salary.getAverage());





        Double total = employeeList.stream().mapToDouble(e -> e.getSalary())
                .sum();
        System.out.println("Total salary : " +total);
        Double averaged = employeeList.stream().mapToDouble(e -> e.getSalary())
                .average()
                .orElse(0);
        System.out.println("Average salary : " +averaged);


    }
}
