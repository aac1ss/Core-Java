import java.util.*;

class Meths{
	public void arylst(){	
		List<Student> al= new ArrayList<>();
		al.add(new Student(1,"Zed"));
		al.add(new Student(2,"Ded"));
		al.add(new Student(3,"Red"));	
		al.add(new Student(4,"Led"));
		al.add(new Student(5,"Fed"));
		for(Student s:al){
		System.out.println(s);
		}
	}
}