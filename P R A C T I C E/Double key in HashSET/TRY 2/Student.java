import java.util.*;
class Student {
	
	private int id;
	private String name;
	private int age;

	Student(int id,String nam,int age){
		this.id = id;
		this.name = nam;
		this.age = age;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public int getAge(){
		return age;
	}
	
	public String toString(){
		return "ID: "+id+" Name: "+name+"AGE: "+age;
	}
	@Override
	public boolean equals(Object o){
		if(o==null || getClass()!=o.getClass()){
			return false;
		}
		if(this==o){
			return true;
		}
		
			Student s=(Student)o;
			return this.id == s.id;
	}
@Override
    public int hashCode() {
        return Objects.hash(id); 
    }
}