import java.util.*;
class Mainnn{

	public static void main(String[] args){
		Set<Student> mp=new HashSet<>();
		mp.add(new Student(1,"Ah1 ",23));
		mp.add(new Student(2,"Ah2 ",23));
		mp.add(new Student(3,"Ah3 ",23));
		mp.add(new Student(4,"Ah4 ",23));
		mp.add(new Student(4,"Ah5 ",23));
		for(Student entry:mp){
		System.out.println(entry);
	}}
}