import java.util.*;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a map to hold department names as keys and lists of Employees as values
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        // Create some Employee objects
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);
        Employee emp4 = new Employee("Charlie", 103);
        
        // Adding employees to the "Engineering" department
        departmentMap.putIfAbsent("Engineering", new ArrayList<>());
        departmentMap.get("Engineering").add(emp1);
        departmentMap.get("Engineering").add(emp2);

        // Adding employees to the "HR" department
        departmentMap.putIfAbsent("HR", new ArrayList<>());
        departmentMap.get("HR").add(emp3);
        
        // Adding another employee to the "Engineering" department
        departmentMap.get("Engineering").add(new Employee("David", 104));

        // Displaying the employees in each department
        for (String department : departmentMap.keySet()) {
            System.out.println(department + ": " + departmentMap.get(department));
        }
    }
}