package Java8.StreamRealTimeProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNoOfEmployee {

    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();


        Map<String, Long> countNoOfEachDepartmentEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));

       countNoOfEachDepartmentEmployee
               .forEach((depart, count) -> System.out.println(depart + " : " + count));




       Map<String , Long> count = employeeList.stream()
               .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
       for (Map.Entry<String, Long> enter : count.entrySet()){
           System.out.println(enter.getKey() +" : "+ enter.getValue());
       }
    }
}
