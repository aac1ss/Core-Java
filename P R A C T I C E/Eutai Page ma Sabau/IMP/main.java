import java.util.*;
class Student{
	String name;
	int rollNo;

	Student(String nam,int roll){
	this.name=nam;
	this.rollNo=roll;
	}

	public String getNam(){
	return name;
	}

	public int getRoll(){
	return rollNo;
	}

	@Override
	public String toString(){
	return "Name: "+name+" " +"Roll No: "+rollNo	;
	}

	@Override
	public boolean equals(Object o){
	if(this=o)return true;
	if(o==ni	

	}

}	
class main{
	public static void main(String[] args){
	Set<Student> studentSet=new HashSet<>();
	studentSet.add(new Student("Rze",4));
	studentSet.add(new Student("Rze",4));
	studentSet.add(new Student("subRoza",1));
	studentSet.add(new Student("Axae",5));
	System.out.println(studentSet);
	}
}