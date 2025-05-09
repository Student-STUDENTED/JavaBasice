package Java8.StreamRealTimeProblems;



import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostWorkingExperience {


    public static void main(String[] args) {

        List<EmployeeClass> employeeList = EmployeeClass.getEmployee();


        Optional<EmployeeClass> mostExperienceEmployee = employeeList.stream()
                .min(Comparator.comparingInt(e -> e.yearOfJoining));
        System.out.println(mostExperienceEmployee);





       Optional<EmployeeClass> experience = employeeList.stream()
                        .sorted(Comparator.comparing(e -> e.yearOfJoining))
                        .findFirst();
        System.out.println(experience);
    }
}
