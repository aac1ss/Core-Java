import java.util.ArrayList;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class EmployeeManager {
    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30));
        employees.add(new Employee("Jane Smith", 25));
        employees.add(new Employee("Bob Johnson", 35));

        return employees;
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        ArrayList<Employee> employeeList = employeeManager.getEmployees();

        System.out.println("Employees:");
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
        }
    }
}