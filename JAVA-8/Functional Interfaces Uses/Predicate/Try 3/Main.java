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
	

// Salary > 25000 "and" Employee gender is Female
	Predicate<Employee> femaleCheck = emp -> emp.getGender().equalsIgnoreCase("female");
		e1.setGender("Female");
	boolean result=empSalaryCheck.and(femaleCheck).test(e1);
	System.out.println(result);

// Salary > 25000 "Or" Employee gender is Female
	result=empSalaryCheck.or(femaleCheck).test(e1);
	System.out.println(result);

// negate() --> converted to ulto value if true its' falses and false is true 
	result=femaleCheck.negate().test(e1);
	System.out.println(result);
	
// Req: Emmployee Have to Validate other Employee 
// Employee : Equals Method

Predicate<Employee> baseEmp=Predicate.isEqual(e1);
Employee e2= new Employee();
		e2.setId(2);
		e2.setSalary(20029);
		e2.setName("Jhamu");
		baseEmp.test(e2);
	}
}