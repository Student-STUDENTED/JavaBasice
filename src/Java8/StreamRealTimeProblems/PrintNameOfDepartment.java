package Java8.StreamRealTimeProblems;

import java.util.List;

public class PrintNameOfDepartment {

    public static void main(String[] args) {

        List<EmployeeClass> employeeClasses = EmployeeClass.getEmployee();


        employeeClasses.stream().map(e -> e.getDepartment())
                .forEach(e -> System.out.println(e));



    }
}
