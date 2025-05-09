package Java8.StreamRealTimeProblems;

import java.util.List;

public class NameEmployeeJoinedAfter2015 {

    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();


        employeeList.stream().filter(e -> e.yearOfJoining > 2015)
                .map(e -> e.getName())
                .forEach(e-> System.out.println(e));
    }
}
