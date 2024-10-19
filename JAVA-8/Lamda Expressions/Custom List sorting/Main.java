import java.util.*;

class Main{
	public static void main(String[] args) {
		List<Student> al=new ArrayList<>();
		al.add(new Student(1,"Axzh"));
		al.add(new Student(4,"hxzh"));
		al.add(new Student(0,"gasxh"));
		al.add(new Student(9,"zxsh"));
		System.out.println("x----B E F O R E ---- S O R T I N G------x");	
		System.out.println("------------------------------------------");	
		for(Student s : al){
		System.out.println(s);	
		}

		System.out.println("------------------------------------------");	

		System.out.println("x----A F T E R ---- S O R T I N G------x");	
		Collections.sort(al,(a,b)->b.getId()-a.getId());
		for(Student s : al){
		System.out.println(s);	
		}

	}
}