class Student{
	
	private int rollno;
	private String name;	

	Student(int r,String n){
		this.rollno=r;
		this.name=n;
	}

	public int getRoll(){
		return rollno;
	}

	public String getName(){
		return name;
	}

	public String toString(){
		return "|"+"Roll: "+ rollno+"| |"+"Name: "+name+"|";
	}
}