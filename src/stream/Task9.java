package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee("Cavidan", "IT", 4000),
                        new Employee("Ali", "IT", 2500),
                        new Employee("Leyla", "HR", 3000),
                        new Employee("Anar", "HR", 3500));

        Map<String, Optional<Employee>> topPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        System.out.println("Departament üzrə ən yüksək maaşlar:");
        topPaidByDept.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp.orElse(null))
        );
    }
}
