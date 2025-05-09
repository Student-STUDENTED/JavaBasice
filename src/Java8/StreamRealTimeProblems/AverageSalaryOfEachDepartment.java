package Java8.StreamRealTimeProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AverageSalaryOfEachDepartment {


    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();

        Map<String, Double> map = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(),
                        Collectors.averagingDouble(e -> e.getSalary())));


        for (Map.Entry<String , Double> entry : map.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }

}
