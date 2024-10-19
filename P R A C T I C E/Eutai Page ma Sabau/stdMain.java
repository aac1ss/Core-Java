import java.util.*;
class Student{

	private int stdid;
	private String stdname;
	private int age;

	Student(int id,String nam,int age){
	this.stdid=id;
	this.stdname=nam;
	this.age=age;
	}

	public int getId(){
	return stdid;
	}
	public String getName(){
	return stdname;
	}
	public int getAge(){
	return age;
	}
}
class StudentList{
	public ArrayList<Student> stdLst(){
	ArrayList<Student> as=new ArrayList<Student>();
	as.add(new Student(1,"Sova",16));
	as.add(new Student(2,"Cypher",26));
	as.add(new Student(3,"Sova",16));
	return as;
	}	
}
class stdMain{
	public static void main(String[] args){
	StudentList sl=new StudentList();
	Map<String,ArrayList<Student>> mp=new HashMap<>();
	mp.put("Bca",sl.stdLst());
	System.out.println("Students");
	for(String category:mp.keySet()){
	System.out.println("Category"+category);
	System.out.println("Id\t"+"Name\t"+"Age\t");
	ArrayList<Student> sts=mp.get(category);
	for(Student i:sts){
	System.out.println(i.getId()+"\t"+i.getName()+"\t"+i.getAge()+"\t");
	}
}
	}
}

