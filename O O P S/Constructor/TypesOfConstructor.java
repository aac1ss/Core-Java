class Constrctr{
	String name;
	int employeeId;	

	public Constrctr(){
	System.out.println("This is a Default Constructor having value of"+this.name	+this.employeeId);
	}

	public Constrctr(int e,String p){
	this.name=p;
	this.employeeId=e;
System.out.println("This is a Parameterized Constructor having value of"+this.name+this.employeeId);
	}

public static void main(String[] args){
	Constrctr e= new Constrctr();
	Constrctr e1= new Constrctr(1,"Ashish");	
}
}