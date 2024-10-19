import java.util.*;

class Meths{
	public void meth(){
		Set<Student> mp=new HashSet<>();
		mp.add(new Student(1,"Rade"));
		mp.add(new Student(2,"Eade"));	
		mp.add(new Student(3,"Dade"));	
		mp.add(new Student(4,"Zade"));	
		mp.add(new Student(3,"Asde"));
	for(Student entry:mp){
		System.out.println(entry);

	}
	}
}