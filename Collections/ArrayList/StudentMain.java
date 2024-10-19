import java.util.*;

class Student{
	private String name;
	private int age;
	private String stream;
	
	Student(String name,int age,String name2){
	this.name=name;
	this.age=age;
	this.stream=name2;
	}
	
	public String getName(){
	return name;
 	}

	public int getAge(){
	return age;
	}

	public String getStream(){
	return stream;
	}
}
class StudentList{
	public ArrayList<Student> studentsList(){
	ArrayList<Student> stdList=new ArrayList<>();
	stdList.add(new Student("Raze",29,"Java"));
	stdList.add(new Student("ZaZa",90,"JavaScript"));
	stdList.add(new Student("zSz",21,"Python"));
	return stdList;
	}
}
class StudentMain{ 	
	public static void main(String[] args){
	StudentList r=new StudentList();
	ArrayList<Student> lissts=r.studentsList();
	System.out.println( "Students");
	System.out.println( "Name \t"+ "Age \t"+"Stream \t");	
		
	for(Student i:lissts){
	System.out.println(i.getName() +"\t"+i.getAge()+"\t"+i.getStream()+"\t");
	}	
	}

}