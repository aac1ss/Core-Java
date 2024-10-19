import java.util.*;
class A{
	public static void main(String args[]){
	TreeSet<Integer> t= new TreeSet<>(new MyCompr());
	t.add(10);
	t.add(7);
	t.add(75);
	t.add(146);
	t.add(53);
	t.add(24);	
	System.out.println(t);
	}
}
class MyCompr implements Comparator<Integer>{
	
@Override
	public int compare(Integer i1,Integer i2){
	return i1.compareTo(i2);
	}		

	}