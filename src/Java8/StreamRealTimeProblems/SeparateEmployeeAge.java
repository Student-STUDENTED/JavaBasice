package Java8.StreamRealTimeProblems;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEmployeeAge {

    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();

        Map<Boolean, List<EmployeeClass>> list = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() <= 25));

       for (Map.Entry<Boolean, List<EmployeeClass>> entry : list.entrySet()){
           if (entry.getKey()) {

               System.out.println("Employee age 25 or younger : " );
           }
           else {
               System.out.println("Employee older than 25 year : ");
           }

         entry.getValue().forEach(e -> System.out.println(e.getName()));
       }
    }
}
