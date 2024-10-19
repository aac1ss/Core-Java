import java.util.*;
class test2{
	public static void main(String[] args){
	TreeSet<String> h=new TreeSet<>(new MyCompr());
	h.add("r");
	h.add("O");
	h.add("A");
	h.add("O");
	h.add("B");
	h.add("null");
	h.add("10");
	System.out.println(h);	
		

}
}
class MyCompr implements Comparator<String>{
	
	public int compare(String i1,String i2){
	return i2.compareTo(i1);
	}		

	}
