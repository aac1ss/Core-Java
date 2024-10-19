import java.util.*;
class main{
	public static void main(String[] args){
		Map<Integer,Student> mp=new HashMap<>();
		mp.put(1,new Student(1,"Ah1",23));
		mp.put(2,new Student(2,"Ah2",23));
		mp.put(3,new Student(3,"Ah3",23));
		mp.put(4,new Student(4,"Ah4",23));
		mp.put(5,new Student(4,"Ah5",23));
		for(Map.Entry<Integer,Student> entry:mp.entrySet()){
System.out.println("KEY: "+entry.getKey()+"VALUE: "+entry.getValue());
	}
}
}