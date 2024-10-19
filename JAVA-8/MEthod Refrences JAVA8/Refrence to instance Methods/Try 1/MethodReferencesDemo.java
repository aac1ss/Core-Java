class MethodReferencesDemo{
	public static void main(String[] args) {
		
// Class NAme :: Static Method
		Employee e = new Employee();
		Employeevalidation validEmployee= e :: validateEmpDetails;
		Employee emp1=new Employee(0," "," ",0);
		Employee emp2=new Employee(1,"Ashish","Male",42.6);
		//Employee emp3=new Employee(1,"Ashish",42.6,"Male");
		System.out.println(validEmployee.isValidEmployee(emp1));
		System.out.println(validEmployee.isValidEmployee(emp2));
		//System.out.println(validEmployee.isValidEmployee(emp3));
	
	}
}