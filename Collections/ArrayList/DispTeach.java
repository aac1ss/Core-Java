import java.util.*;
class Teacher{
	private String teachName;
	private int teachAge;

	Teacher(String nam,int age){
	this.teachName=nam;
	this.teachAge=age;
	}

	public String getNam(){
	return teachName;
	}	

	public int getAge(){
	return teachAge;
	}
}
class TeacherList{
	public ArrayList<Teacher> getTeachList(){
	ArrayList<Teacher>  Litem=new ArrayList<>();
	Litem.add(new Teacher("Jett",22));
	Litem.add(new Teacher("Cypher",90));
	Litem.add(new Teacher("Sova",21));
	Litem.add(new Teacher("Reyna",69));
	Litem.add(new Teacher("Omen",103));
	return Litem;
	}
}	
class DispTeach{
	public static void main(String[] args){
	TeacherList r=new TeacherList();
	ArrayList<Teacher> teachers=r.getTeachList();
	System.out.println("The names of techer with their age are");
	for(Teacher i:teachers){
	System.out.println("Name: "+i.getNam()+"Age: "+i.getAge());
	}	
	}
}

