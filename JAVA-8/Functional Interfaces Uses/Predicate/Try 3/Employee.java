import java.util.function.Function;
class Employee{
	private int id;
	private String name;
	private double salary;
	private String gender;

	public boolean equals(Object obj){
		Employee e= (Employee) obj;
		return this.getId()==getId();
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

	public String getname(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}

	public String getGender(){
		return name;
	}
	public void setGender(String name){
		this.name=name;
	}

}