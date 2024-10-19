public class Employee{
	private int id;
	private String name;
	private String gender;
	private double salary;
	
	public Employee(){

	}
	public Employee(int id,String name,String gender,double salary){
	this.id=id;
	this.name=name;
	this.gender=gender;
	this.salary=salary;
	}

	 boolean validateEmpDetails(Employee employee){
		
		// id and name should be present to be true. 

		return employee.getId() != 0 && employee.getName() != null;
		
	}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}	

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}	

	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}	

}