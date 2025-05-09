package Java8.StreamRealTimeProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleAndFemaleEmployeeInSalesAndMarketing {


    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();

        Map<String, Long> countMaleAndFemaleEmployeeInSalesAndMarketing = employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));

        System.out.println(countMaleAndFemaleEmployeeInSalesAndMarketing);
    }
}
