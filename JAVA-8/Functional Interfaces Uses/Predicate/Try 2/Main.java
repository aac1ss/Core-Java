import java.util.function.*;
class Main{
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setId(1);
		e1.setSalary(10029);
		e1.setName("Ramu");
	Predicate<Employee> empSalaryCheck = emp -> emp.getSalary() > 27000;
	if(empSalaryCheck.test(e1)){
		System.out.println("ABove 27000");
	}else{
		System.out.println("Below 27000");
	}

}
}