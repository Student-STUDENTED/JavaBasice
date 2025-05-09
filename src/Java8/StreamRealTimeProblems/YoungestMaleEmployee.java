package Java8.StreamRealTimeProblems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestMaleEmployee {

    public static void main(String[] args) {
        List<EmployeeClass> employeeClassList = EmployeeClass.getEmployee();


        Optional<EmployeeClass> youngestEmployeeDetail = employeeClassList.stream()
                .filter( e -> e.getGender().equalsIgnoreCase("male")
                        && e.getDepartment() == "Product Development")
                .min(Comparator.comparingInt(e -> e.getAge()));

        System.out.println(youngestEmployeeDetail);
    }
}
