package Java8.StreamRealTimeProblems;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfMaleAndFemale {

    public static void main(String[] args){

        List<EmployeeClass> employee = EmployeeClass.getEmployee();


        Map<String, Long> map = employee.stream()
                .collect(Collectors.groupingBy(i -> i.getGender(), Collectors.counting()));

        System.out.println(map);



        long male = employee.stream().
                filter(e -> e.getGender().equalsIgnoreCase("Male")).count();
        long female = employee.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("female")).count();
        System.out.println("Male : " + male);
        System.out.println("Female : " + female);
    }
}
