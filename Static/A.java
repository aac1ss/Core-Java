class Employee
{
	int empid;
	String name;
	static String company="Code Himalaya";

	Employee(int id, String nam){
	this.empid=id;
	this.name=nam;
}
	void display(){
		System.out.println("Hi "+name+" (S.N) "+empid+" "+company);
	}
	public static void main(String[] args){
		Employee r= new Employee(1,"Ashish");
		Employee r1= new Employee(2,"Hashish");
			
	r.display();
	r1.display();
}
}