import java.util.*;

class Student{

	private int rollno;
	private String name;

	public Student(int r,String n){
		this.rollno=r;
		this.name=n;
	}

	int getRoll(){
		return rollno;
	} 
	public String getName(){
		return name;
	} 

	public String toString(){
		return "Roll No."+" "+rollno+" "+"Name: "+" "+name;
	}

 @Override
    public boolean equals(Object o) {
        if (o instanceof Student) { 
            Student s = (Student) o; 
            return this.rollno == s.rollno;
        }
        return false; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno); 
    }
}